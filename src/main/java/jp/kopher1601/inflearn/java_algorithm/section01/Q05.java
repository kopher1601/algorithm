package jp.kopher1601.inflearn.java_algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 *
 * Input
 * a#b!GE*T@S
 *
 * Output
 * S#T!EG*b@a
 */
public class Q05 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            char[] chars = str.toCharArray();

            int lp = 0;
            int rp = chars.length - 1;

            while (lp < rp) {
                if (Character.isAlphabetic(chars[lp]) && Character.isAlphabetic(chars[rp])) {
                    char temp = chars[lp];
                    chars[lp++] = chars[rp];
                    chars[rp--] = temp;
                }

                if (!Character.isAlphabetic(chars[lp])) {
                    lp++;
                }

                if (!Character.isAlphabetic(chars[rp])) {
                    rp--;
                }
            }

            System.out.println(chars);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
