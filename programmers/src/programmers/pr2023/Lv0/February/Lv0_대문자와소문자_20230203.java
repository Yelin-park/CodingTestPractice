package programmers.pr2023.Lv0.February;

public class Lv0_대문자와소문자_20230203 {
    class Solution {
        public String solution(String my_string) {
            String answer = "";

            for(int i = 0; i < my_string.length(); i++){
                if(my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90) {
                    answer += (my_string.charAt(i)+"").toLowerCase();
                } else {
                    answer += (my_string.charAt(i)+"").toUpperCase();
                }
            }

            return answer;
        }
    }
}
