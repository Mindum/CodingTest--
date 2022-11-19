package Test;

import java.util.Scanner;

public class B1eak2798 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();  //입력받을 카드의 수
        int M = in.nextInt();  //맞추고자 하는 수

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int result = search(arr,N,M);

        System.out.println(result);
    }

    public static int search(int arr[], int N, int M){ //카드 3장을 합쳐서 만들어야 함으로 3중 for문을 이용해서 만들기

        int result = 0;
        for(int i = 0; i < N-2 ; i ++){
            for(int j = 0 ; j < N-1 ; j ++){
                for(int k = 0 ; k < N ; k++){
                    result = arr[i] + arr[j] + arr[k];

                    int temp = M;
                    if ( result == temp){
                        return temp;
                    }
                    if( result < temp && temp < M){
                        result = temp;
                    }
                }
            }
        }
        return result;

    }
}