package Test;

import java.util.Scanner;
import java.util.Stack;

import static jdk.nashorn.internal.objects.NativeArray.push;

public class Beak10828 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int T = in.nextInt();
        stack = new int[T];

        for(int i = 0 ; i < T; i++){
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
