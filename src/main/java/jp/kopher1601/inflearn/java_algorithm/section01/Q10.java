package jp.kopher1601.inflearn.java_algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 * Input
 * teachermode e
 *
 * Output
 * 1 0 1 2 1 0 1 2 2 1 0
 */

public class Q10 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] str = br.readLine().split(" ");
            String s = str[0];
            char t = str[1].charAt(0);
            int p = 1000;

            int[] answer = new int[s.length()];

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == t) {
                    p = 0;
                } else {
                    p++;
                }
                answer[i] = p;
            }

            p = 1000;
            for (int i = s.length() - 1 ; i >= 0; i--) {
                if (s.charAt(i) == t) {
                    p = 0;
                } else {
                    p++;
                }
                answer[i] = Math.min(answer[i], p);
            }

            for (int i = 0; i < answer.length; i++) {
                System.out.print(answer[i] + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
