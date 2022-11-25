package Test;

import java.util.Scanner;

public class Beak2869 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int result = ( V - B) % ( A - B);

        if((V - B) % (A - B)!=0){
            result++;
        }
        System.out.println(result);
    }
}
