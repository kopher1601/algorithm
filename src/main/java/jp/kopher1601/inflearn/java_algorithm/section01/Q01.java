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
            String target = br.readLine();
            String[] strings = line.split("");

            int count = 0;
            for (String aWord : strings) {
                if (aWord.equalsIgnoreCase(target)) {
                    count++;
                }
            }
            System.out.println(count);

        } catch (IOException e) {
            System.out.println("e = " + e);
        }
    }
}
