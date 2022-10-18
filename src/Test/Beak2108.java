package Test;

import java.util.Scanner;
/*통계학
첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.

둘째 줄에는 중앙값을 출력한다.

셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.

넷째 줄에는 범위를 출력한다.
 */
public class Beak2108 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int N  = in.nextInt();

        int arr[] = new int[8001];
        //입력값이 -4000 ~ 4000까지 이기때문에

        /*
        sum = 총 합계
        max = 최댓값
        min = 최솟값
        median = 중앙값
        mode = 최빈값
         */

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //median과 mode는 -4000 ~ 4000 을 제외한 수로 초기화하면 된다.
        int median = 10000;
        int mode = 10000;

        for ( int i = 0; i < N; i++){
            int value = in.nextInt();
            sum += value;
            arr[value+4000]++;

            if( max < value){
                max = value;
            }
            if( min < value) {
                min = value;
            }
        }

        int count = 0; // 중앙값 빈도 누적 수
        int mode_max = 0; // 최빈값의 최댓값

        //이전의 동일한 최빈값이 1번만 나오면 true, 아니면 false
        boolean flag = false;

        for(int i = min+4000; i <=max + 4000; i++){

            if(arr[i] > 0){
                //중앙값 찾기
                // 누적횟수가 전체 길이의 절반에 못 미친다면
                if(count < (N + 1 ) / 2){
                    count +=arr[i];
                    median = i-4000;
                }
                //최빈값 찾기
                // 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우
                if(mode_max < arr[i]){
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true; // 첫 등장이므로 true로 변경
                }
                // 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우
                else if( mode_max == arr[i] && flag == true){
                    mode = i -4000;
                    flag = false;
                }
            }
        }
        System.out.println((int)Math.round((double) sum / N)); // round는 반올림
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);




    }
}
