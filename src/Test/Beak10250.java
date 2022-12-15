package Test;

import java.util.Scanner;
//ACM호텔
//배열 생성 안하고 수식으로만으로도 가능할 듯?
public class Beak10250 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for(int i = 0; i < T ; i++){
            int H = in.nextInt();
            int W = in.nextInt();
            int N = in.nextInt();

            if( N % H == 0){
                System.out.println((H*100) + (N / H) );
            }else {
                System.out.println(((N % H) * 100) + (N / H) + 1);
            }
        }
    }
}
