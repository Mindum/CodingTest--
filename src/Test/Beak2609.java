package Test;

import java.util.Scanner;

public class Beak2609 {
    public static void main ( String[]args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int H = gcd(N,M);

        System.out.println(H);
        System.out.println(N*M/H);
    }

    public static int gcd(int N, int M){
        while ( M != 0){
            int r = N % M;

            N = M;
            M = r;
        }
        return N;
    }

}
