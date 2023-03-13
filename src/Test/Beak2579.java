package Test;

import java.util.Scanner;
//계단 오르기 ( 재귀를 통해서 큰 것부터 작은것으로 가는 문제) - > Top-Down
public class Beak2579 {

    static Integer dp[];//int가 아닌 integer로 처리한 이유는 null값을 처리할 수 있기 때문이다.
    static int arr[];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        dp = new Integer[T+1]; //맨 처음에 null값을 넣어 처리해주기 위해서 T+1
        arr = new int[T+1]; //

        for(int i = 1; i <= T; i++){
            arr[i] = in.nextInt();
        }

        dp[0] = arr[0];//디폴드값이 NULL이므로 초기화해주는 과정
        dp[1] = arr[1];

        if( T >= 2){
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(search(T));
    }

    static int search(int T){
        if (dp[T] == null){
            dp[T] = Math.max(search(T-2), search(T-3) + arr[T-1])+ arr[T];
            //위에서부터 아래로 내려오는 것이므로 2번째 전칸을 3번째 전칸과 바로 전칸을 더한것과 비교해서 현재 내가 있는 arr[T]를 더해서 반환을 해준다.
        }

        return dp[T];//재귀를 이용해서 큰 것부터 작은것으로 가는 방법
    }
}
