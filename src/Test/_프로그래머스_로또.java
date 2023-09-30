package Test;

public class _프로그래머스_로또 {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int min_num = 0;
            int zero_num = 0;
            for ( int i = 0 ; i < lottos.length ;i ++){
                for( int j = 0 ; j< win_nums.length ; j++){
                    if(lottos[i] == win_nums[j]){
                        min_num++;
                    }
                }
                if(lottos[i]==0){
                    zero_num++;
                }
            }
            int max_num = min_num + zero_num;
            int[] answer = {max_num, min_num};

            for(int i = 0; i < 2; i++) {
                if(answer[i] == 6) answer[i] = 1;
                else if(answer[i] == 5) answer[i] = 2;
                else if(answer[i] == 4) answer[i] = 3;
                else if(answer[i] == 3) answer[i] = 4;
                else if(answer[i] == 2) answer[i] = 5;
                else answer[i] = 6;
            }
            return answer;
        }
    }
}
