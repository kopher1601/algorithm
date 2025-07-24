package jp.kopher1601.inflearn.java_algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input
 *
 * StuDY
 *
 * Output
 *
 * sTUdy
 *
 */
public class Q02 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char[] chars = br.readLine().toCharArray();
            StringBuilder result = new StringBuilder();

            for (char aChar : chars) {
                if (isLowercase(aChar)) {
                    result.append((char) (aChar - 32));
                } else if (isUppercase(aChar)) {
                    result.append((char) (aChar + 32));
                }
            }
            System.out.println(result);
        }
    }

    // Uppercase 'A' has the decimal value of 65 ~ 90
    private static boolean isUppercase(char chars) {
        return chars > 64 && chars < 91;
    }

    // Lowercase 'a' has the decimal value of 97 ~ 122
    private static boolean isLowercase(char chars) {
        return chars > 96 && chars < 123;
    }
}
