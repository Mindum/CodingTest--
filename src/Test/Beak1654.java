package Test;

import java.util.Scanner;
//랜선 자르기
public class Beak1654 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        int K = in.nextInt();
        int N = in.nextInt();

        int[] arr = new int[K];

        long max = 0;

        //입력받은 랜선의 길이중 최대 값을 max에 저장
        for (int i = 0; i < K; i++) {
            arr[i] = in.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        //오류 방지를 위해 max에 + 1
        max++;

        long min = 0;
        long mid = 0;

        while (min < max) {

            mid = (max + min) / 2;

            long count = 0;

            //구한 중간 길이로 잘라서 총 몇개가 만들어지는지 구한다
            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }

            /*
             *  [upper bound 형식]
             *
             *  mid길이로 잘랐을 때의 개수가 만들고자 하는 랜선의 개수보다 작다면
             *  자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다.
             *  그 외에는 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다.asdfasdf
             */

            if (count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }
}
