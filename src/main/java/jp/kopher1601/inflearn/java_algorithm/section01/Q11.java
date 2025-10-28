package jp.kopher1601.inflearn.java_algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input
 * KKHSSSSSSSE
 *
 * Output
 * K2HS7E
 */

public class Q11 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            str = str + " ";
            int count = 1;
            String answer = "";

            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else {
                    answer += str.charAt(i);
                    if (count > 1) {
                        answer += String.valueOf(count);
                    }
                    count = 1;
                }
            }

            System.out.println(answer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
