package jp.kopher1601.inflearn.java_algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input
 * gooG
 *
 * Output
 * YES
 */

public class Q07 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine().toLowerCase();

            int lp = 0;
            int rp = str.length() - 1;

            while (lp < rp) {
                if (str.charAt(lp) != str.charAt(rp)) {
                    System.out.println("NO");
                    return;
                }
                lp++;
                rp--;
            }
            System.out.println("YES");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
