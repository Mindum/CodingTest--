package Test;

import java.util.Scanner;
//벌집
public class Air2 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int count = 1;
        int range = 2;

        if( N == 1){
            System.out.println(1);
        }
        else {
            while ( range <= N){
                range = range + ( count *6);
                count++;
            }
            System.out.println(count);
        }
    }
}
