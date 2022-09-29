package Test;


import java.util.Scanner;
//팰린드롬수
public class Beak1259 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String N = sc.next();
            if(N.equals("0")) break;

            String[] arr = new String[N.length()];
            String[] arr2 = new String[N.length()];

            //reverse
            for(int i = 0; i<N.length();i++){
                arr2[i] = arr[N.length()-1-i];
            }

            int count = 0;

            for(int i = 0; i<N.length()/2;i++){
                if(arr[i].equals(arr2[i]))count++;
            }


            if(count == N.length()) System.out.println("Yes");
            else System.out.println("No");
        }
    }

}
