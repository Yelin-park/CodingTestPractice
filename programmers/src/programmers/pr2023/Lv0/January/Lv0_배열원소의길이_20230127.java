package programmers.pr2023.Lv0.January;

public class Lv0_배열원소의길이_20230127 {
    class Solution {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];
            for(int i = 0; i < strlist.length; i++){
                answer[i] = strlist[i].length();
            }
            return answer;
        }
    }
}
