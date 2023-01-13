package Test;

import java.util.Scanner;

//스택
public class Beak10828 {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int T = in.nextInt();

        stack = new int[T];

        for(int i = 0 ; i < T; i++){//여러가지 경우마다 어떻게 스택을 할지 정하는 for문
            String str = in.next();

            switch (str) {
                case "push":
                    push(in.nextInt());
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
    public static void push(int item){
        stack[size] = item;
        size++;
    }

    public static int pop() {
        if(size == 0 ){
            return -1;
        }
        else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size --;
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int top() {
        if(size == 0){
            return -1;
        }
        else {
            return stack[size - 1 ];
        }
    }
}
