package Test;

import java.util.Scanner;

public class B1eak2798 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int result = search(arr, N, M);
        System.out.println(result);
    }

    public static int search(int arr[], int N, int M) {

        int result = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < N - 1; j++) {
                for (int k = 0; k < N; k++) {
                    int temp = arr[i] + arr[j] + arr[k];

                    if (temp == M) {
                        return temp;
                    }
                    if (result < temp && result < M) {
                        result = temp;
                    }

                }
            }
        }
        return result;
    }
}
