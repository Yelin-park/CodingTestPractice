package programmers.pr2023.Lv0.January;

public class Lv0_문자열뒤집기_20230128 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";
            for(int i = my_string.length()-1; i >= 0 ; i--) {
                answer += my_string.charAt(i);
            }
            return answer;
        }
    }
}
