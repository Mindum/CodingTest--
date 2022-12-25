package Test;

import java.util.Scanner;
//부녀회장이 될테야

public class Beak2775 {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        int[][] APT = new int[15][15];

        for(int i =0 ; i < 15; i++){
            APT[i][1] = 1;
            APT[0][i] = i;
        }

        for ( int i = 1; i < 15 ; i++){
            for( int j = 2; j < 15; j++){
                APT[i][j] = APT[i][j-1] + APT[i-1][j]; // 15층의 아파트를 만들어놓고 수를 찾으러 가는거임
            }
        }
        int T = in.nextInt();

        for(int i = 0 ; i < T ; i++){
            int N = in.nextInt();
            int M = in.nextInt();
            System.out.println(APT[N][M]);
        }
    }
}
