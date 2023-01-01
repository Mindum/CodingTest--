package Test;

import java.util.Scanner;
//달팽이
public class Beak2869 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int result = ( V - B) / ( A - B); //숫자가 딱 떨어졌을 때를 기준으로 계산을 한 것

        if((V - B) % (A - B)!=0){
            result++; //숫자가 딱 떨어지지 않는다면 마지막날 더 올라가야 하므로 result++을 해주었다.
        }
        System.out.println(result);
    }
}
