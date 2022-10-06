package Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
//단어 정렬
public class Beak1181 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String arr[] = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextLine();
        }

        Arrays.sort(arr, new Comparator<String>() { //내림차순으로 정렬해주는 기능
            public int compare (String s1, String s2){ // 문자열을 비교해주는 함수 compare
                if (s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }
                else{
                    return s1.length() - s2.length();
                }
            }
        });
        System.out.println(arr[0]);

        for(int i=1;i<N;i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }
    }
}

