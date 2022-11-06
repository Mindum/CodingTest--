package Test;

import java.util.Scanner;
import java.util.Stack;

// 스택 수열
public class Beak1874 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>(); //새로 배운 개념

        int N = in.nextInt();

        int start = 0;

        while( N--> 0) {

            int value = in.nextInt();

            if (value > start) {
                for (int i = start + 1; i <= value; i++) {
                    stack.push(i);  // 새로 배운 개념
                    sb.append('+').append('\n');
                }
                start = value;
            }
            //top에 있는 원소가 입력받은 값과 같지 않은 경우
            else if (stack.peek() != value) { //새로 배운 것
                System.out.println("No");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);

        }
    }
