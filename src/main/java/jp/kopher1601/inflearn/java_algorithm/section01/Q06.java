package jp.kopher1601.inflearn.java_algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 * Input
 * ksekkset
 *
 * Output
 * kset
 */

public class Q06 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            String answer = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(str.charAt(i)) == i) {
                    answer += str.charAt(i);
                }
            }
            System.out.println(answer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
