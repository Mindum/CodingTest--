package Test;

import java.util.Scanner;
//최소공배수와 최대 공약수
public class Beak2609 {
    public static void main ( String[]args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int H = gcd(N,M);

        System.out.println(H);
        System.out.println(N*M/H);
    }

    public static int gcd(int N, int M){ // 유클리드 알고리즘 gcd
        while ( M != 0){
            int r = N % M; //나머지를 구해준다

            N = M;
            M = r;
        }
        return N;
    }

}
