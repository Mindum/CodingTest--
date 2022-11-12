package Test;

import java.util.Scanner;
//벌집
public class Beak2292 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int count = 1;
        int range = 2;


        if (N == 1) {
            System.out.println(1);
        } else {
            while (range <= N) { // 규칙을 찾아봤을 때 벌집모양으로 인해 바깥쪽으로 이동 할 수록 6씩 늘어남
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
