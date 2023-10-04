package Test;

public class _프로그래머스_옹알이2 {
    class Solution {
        public int solution(String[] babbling) {
            int answer = 0;
            String[] temp = {"aya", "ye", "woo", "ma"};

            for(int i = 0; i < babbling.length; i++)
            {
                int len = babbling[i].length();
                for(int j = 0; j < temp.length; j++)
                {
                    if(babbling[i].contains(temp[j]))
                    {
                        if(len-temp[j].length() >= 0)
                        {
                            len-=temp[j].length();
                        }
                    }
                }
                if(len == 0)
                {
                    answer++;
                }
            }
            return answer;
        }
    }
}
