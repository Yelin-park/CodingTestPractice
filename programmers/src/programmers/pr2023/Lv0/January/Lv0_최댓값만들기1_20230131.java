package programmers.pr2023.Lv0.January;

import java.util.Arrays;

public class Lv0_최댓값만들기1_20230131 {

    class Solution {
        public int solution(int[] numbers) {
            int answer = 0;

            Arrays.sort(numbers);
            answer = numbers[numbers.length-1] * numbers[numbers.length-2];

            return answer;
        }
    }

}
