package programmers.pr2023.Lv0.February;

import java.util.Scanner;

public class Lv0_직각삼각형출력하기_20230201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
