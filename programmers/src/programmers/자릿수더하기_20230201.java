package programmers;

public class 자릿수더하기_20230201 {

    class Solution {
        public int solution(int n) {
            int answer = 0;
            String strN = Integer.toString(n);

            for(int i = 0; i < strN.length(); i++ ){
                answer += Integer.parseInt(strN.charAt(i)+"");
            }

            return answer;
        }
    }

}
