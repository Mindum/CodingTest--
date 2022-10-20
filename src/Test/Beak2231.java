package Test;

import java.util.Scanner;

//분해합
public class Beak2231 {

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int result = 0;  // 마지막에 출력해줄 결과값을 위해 선언

        for(int i = 0 ; i < N ; i++){
            int sum = 0;
            int number = i;

            while ( number != 0 ){
                sum += number % 10;        //숫자를 10으로 나눴을 때 나머지를 sum에 더하기
                number /= 10;              //10으로 나눈후 그 숫자를 number에 저장함으로써 172에 경우에 2,7,1 이렇게 숫자를 자릿수마다 빼서 sum에 더할 수 있다.
            }

            if(i + sum == N){               // 각 자릿수를 더한 sum과 i를 더했을 때 입력받은 값과 같다면 분해합이 성립
                result = i;
                break;
            }

        }
        System.out.println(result);
    }
}
