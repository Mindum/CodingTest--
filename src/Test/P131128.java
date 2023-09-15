package Test;

import java.util.*;

public class P131128 {
    public String Solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        int[] xCntArr = new int[10];
        int[] yCntArr = new int[10];

        for (String x : X.split("")) {
            xCntArr[Integer.parseInt(x)]++;
        }
        for (String y : Y.split("")) {
            yCntArr[Integer.parseInt(y)]++;
        }

        for (int i = 9; i >= 0; i--) {
            while (xCntArr[i] > 0 && yCntArr[i] > 0) {
                answer.append(i);
                xCntArr[i]--;
                yCntArr[i]--;
            }
        }

        if (answer.length() == 0) {
            return "-1";
        }
        if ("0".equals(answer.toString().substring(0, 1))) {
            return "0";
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        P131128 solution = new P131128();

        String X = "100";
        String Y = "2345";

        String result = solution.Solution(X, Y);

        System.out.println("Result: " + result);
    }
}
