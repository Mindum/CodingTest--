package Test;

import java.util.Scanner;
//나무 자르기
public class Beak2805 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int Max = 0;
        int Min = 0;
        int result = 0;

        int arr[] = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
            if (Max < arr[i]) {
                Max = arr[i];
            }
        }

        while (Min < Max) {             //이분탐색 시작
            int Mid = (Max + Min) / 2;
            long sum = 0;

            for (int arrHeight : arr) {    //배열의 값과 Mid의 값을 빼면서 M과 숫자가 맞지 않으면 다시 while문 처음부터

                if (arrHeight - Mid > 0) {
                    sum += (arrHeight - Mid);
                }
            }
            if (sum < M) {
                Max = Mid;
            } else {
                Min = Mid + 1;
            }
        }
        System.out.println(Min - 1);
    }
}
