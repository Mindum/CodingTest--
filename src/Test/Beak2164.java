package Test;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//카드 2
public class Beak2164 {

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>(); // 큐를 사용할 수 있게 선언해주는 표현

        int N = in.nextInt();

        for(int i = 1; i <= N; i++){
            q.offer(i); // q에 N까지의 숫자들을 모두 넣어주기
             }

        while ( q.size()>1){
            q.poll();         //맨 위에 숫자를 q.poll로 del해주기
            q.offer(q.poll()); // 숫자를 del해주고 바로 맨 뒤에 삽입해주기
        }
        System.out.println(q.poll());
    }
}
