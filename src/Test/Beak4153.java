package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//직각삼각형
public class Beak4153 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            if( N == 0 & M == 0 & K ==0){
                break;
            }


            if((N*N)+(M*M)==(K*K)){
                System.out.println("right");
            }else if((N*N)==(M*M)+(K*K)){
                System.out.println("right");
            }else if((M*M)==(N*N)+(K*K)){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

    }
}
