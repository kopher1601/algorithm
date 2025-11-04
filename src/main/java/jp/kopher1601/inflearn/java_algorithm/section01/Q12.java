package jp.kopher1601.inflearn.java_algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input
 * 4
 * #****###**#####**#####**##**
 * <p>
 * Output
 * COOL
 */

public class Q12 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(br.readLine());
            String str = br.readLine();
            // 0,7
            // 7,14
            // 14,21
            for (int i = 0; i < count; i++) {
                String extractedString = str
                        .substring(i * 7, i * 7 + 7)
                        .replaceAll("#", "1")
                        .replaceAll("\\*", "0");
                System.out.print((char) Integer.parseInt(extractedString, 2));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
