package jp.kopher1601.inflearn.java_algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 文字探し
 *
 * Input
 * Computercooler
 * c
 *
 * Output
 * 2
 */
public class Q01 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            char target = Character.toUpperCase((char) br.read());
            char[] strings = line.toUpperCase().toCharArray();

            int count = 0;
            for (char aWord : strings) {
                if (aWord == target) {
                    count++;
                }
            }
            System.out.println(count);

        } catch (IOException e) {
            System.out.println("e = " + e);
        }
    }
}
