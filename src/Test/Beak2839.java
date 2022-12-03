package Test;

import java.util.Scanner;
//설탕배달
public class Beak2839 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        
        if(N == 4 || N == 7){                //4와 7로는 정확히 나눌수 없음
            System.out.println(-1);
        } else if (N % 5 == 0) {             //5로 딱 나누어 떨어질 때
            System.out.println(N / 5);
        }else if( N  % 5 == 1 || N % 5 == 3){//6이나 8같은 숫자가 있을 경우 5로 나누고 +1을 해준다
            System.out.println((N/5)+1);
        }else if( N % 5 == 2 || N % 5 == 4){//9나 12같은 수들은 5로 1번 나누고 2를 더해줘야 규칙에 맞는다.
            System.out.println((N/5)+2);
        }
    }
}
