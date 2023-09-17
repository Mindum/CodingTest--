package Test;

public class P161989 {
    class Solution {
        public int solution(int n, int m, int[] section) {
            int answer = 0;
            int temp = 0;
            for(int i = 0; i < section.length ; i++){
                if(section[i] < temp) continue;
                answer++;
                temp = section[i] + m;
            }
            return answer;
        }
    }
}
