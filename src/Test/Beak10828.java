package Test;

import java.util.Scanner;
import java.util.Stack;

import static jdk.nashorn.internal.objects.NativeArray.push;
//스택
public class Beak10828 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int T = in.nextInt();
        stack = new int[T];

        for(int i = 0 ; i < T; i++){//여러가지 경우마다 어떻게 스택을 할지 정하는 for문
            String str = in.next();

            switch (str){
                case "push":
                    push(in.nextInt());
                    break;

                case "pop":
                    sb.append(pop()).append('\n')
            }
        }
    }
}
