package Test;

import java.util.Scanner;
import java.util.Stack;

public class work {
    public static void main(String[] args) {
       /* Scanner in =new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N ; i++){
            arr[i] = in.nextInt();
        }
        int result = search(arr, N, M);
        System.out.println(result);
    }
    static int search(int[]arr, int N, int M){

        int result = 0;

        for(int i = 0; i < N - 2;i++){
            for(int j = 0; j < N -1;j++){
                for(int k = 0; k < N;k++){

                    int sum = arr[i] + arr[j] + arr[k];

                    if ( M == sum){
                        return sum;
                    }

                    if(result < sum && sum <M){
                        result = sum;
                    }
                }
            }
        }
        return result;
    }

}*/


       Scanner in = new Scanner(System.in);

        int N = in.nextInt();// 하루 올라가는양
        int M = in.nextInt(); // 떨어지는양
        int Y = in.nextInt();// 총 올라가야하는거리

        int day = (Y - M) / (N -M);

        if((Y - M) % (N - M) != 0){
            day++;
        }
        System.out.println(day);
    }
}

