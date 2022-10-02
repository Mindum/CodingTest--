package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//소수 찾기
public class Beak1978 {
    public static void main(String[]args) throws IOException {

        //input 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while(st.hasMoreTokens()){ // 새로 배운 것

            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken()); // 새로 배운 것

            if(num == 1){
                continue;
            }
            for(int i = 2; i<=Math.sqrt(num);i++){ //지난번에 한 에라토스테네스의 체
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }

        }
        System.out.println(count);
    }
}
















