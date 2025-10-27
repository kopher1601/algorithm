package jp.kopher1601.inflearn.java_algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 *
 * Input
 * g0en2T0s8eSoft
 *
 * Output
 * 208
 */

public class Q09 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char[] chars = br.readLine().toCharArray();

            String answer = "";
            for (char aChar : chars) {
                if (Character.isDigit(aChar)) {
                    answer += aChar;
                }
            }
            System.out.println(Integer.parseInt(answer));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
