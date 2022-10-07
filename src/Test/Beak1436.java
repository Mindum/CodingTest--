package Test;

import java.util.Scanner;
//영화감독 숌
public class Beak1436 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int num = 666;

        while(count < N){
            if(String.valueOf(num).contains("666")){
                count++;
            }
            num += 1 ;
        }
        System.out.println(num-1);
    }

}
