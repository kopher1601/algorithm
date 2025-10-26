package jp.kopher1601.inflearn.java_algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Palindrome 2
 *
 * Condition
 * - Only Alphabetic characters are used.
 * - Uppercase and lowercase letters are considered the same.
 *
 * Input
 * found7, time: study; Yduts; emit, 7Dnuof
 *
 * Output
 * YES
 */
public class Q08 {
    public static void main(String[] args) {
        // answer1();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine().toLowerCase().replaceAll("[^a-z]", "");

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

    private static void answer1() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine().toLowerCase();

            int lp = 0;
            int rp = str.length() - 1;

            while (lp < rp) {
                if (!Character.isAlphabetic(str.charAt(lp))) {
                    lp++;
                }

                if (!Character.isAlphabetic(str.charAt(rp))) {
                    rp--;
                }

                if (Character.isAlphabetic(str.charAt(lp)) && Character.isAlphabetic(str.charAt(rp))) {
                    if (str.charAt(lp) != str.charAt(rp)) {
                        System.out.println("NO");
                        return;
                    }
                    lp++;
                    rp--;
                }
            }

            System.out.println("YES");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
