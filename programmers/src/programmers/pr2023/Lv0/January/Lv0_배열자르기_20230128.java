package programmers.pr2023.Lv0.January;

public class Lv0_배열자르기_20230128 {
    class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = new int[num2-num1+1];

            int no = 0;
            for(int i = num1; i <= num2; i++){
                answer[no++] = numbers[i];
            }

            return answer;
        }
    }
}
