package Test;

import java.util.HashMap;
import java.util.Map;

public class _프로그래머스_대충만든자판 {
    class Solution {
        public int[] solution(String[] keymap, String[] targets) {
            Map<Character,Integer> keyCountMap = new HashMap<>();
            for(String keys : keymap){
                int keyLength = keys.length();
                for ( int i = 0; i < keyLength; i++){
                    char key = keys.charAt(i);
                    int min = Math.min( i +1, keyCountMap.getOrDefault(key, Integer.MAX_VALUE));
                    keyCountMap.put(key,min);
                }
            }
            int[] answer = new int[targets.length];
            for(int targetIndex = 0; targetIndex < targets.length;targetIndex++){
                String target = targets[targetIndex];
                int targetLength = target.length();

                int count = 0;
                for( int i = 0; i < targetLength; i++){
                    char text = target.charAt(i);
                    int value = keyCountMap.getOrDefault(text, -1);
                    if(value == -1){
                        count = -1;
                        break;
                    }else {
                        count += value;
                    }
                }
                answer[targetIndex] = count;
            }
            return answer;
        }
    }
}
