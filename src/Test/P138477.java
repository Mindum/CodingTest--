package Test;

import java.util.ArrayList;
import java.util.Collections;

public class P138477 {



    class Solution {
        public int[] solution(int k, int[] score) {
            int[] answer = new int[score.length];
            ArrayList<Integer> temp = new ArrayList<>();

            for(int i = 0; i <score.length ; i++ ){
                if(temp.size() < k){
                    temp.add(score[i]);
                    Collections.sort(temp);
                    answer[i] = temp.get(0);
                    continue;
                }
                if(temp.size() == k){
                    int minNum = temp.get(0);

                    if(minNum < score[i]){
                        temp.remove(0);
                        temp.add(score[i]);
                        Collections.sort(temp);
                    }
                    answer[i] = temp.get(0);
                }

            }
            return answer;
        }
    }
}
