package jp.kopher1601.inflearn.java_algorithm.section01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
3
good
Time
Big
 *
 * ////
 * Result
 *
 * doog
 * emiT
 * giB
 */
public class Q04 {
    public static void main(String[] args) throws IOException {
        // solution01();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            solution02(br);
        }
    }

    private static void solution02(BufferedReader br) throws IOException {
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            char[] chars = br.readLine().toCharArray();
            int lt = 0;
            int rt = chars.length - 1;
            while (lt < rt) {
                char temp = chars[lt];
                chars[lt++] = chars[rt];
                chars[rt--] = temp;
            }
            System.out.println(chars);
        }
    }

    private static void solution01() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(br.readLine());
            for (int i = 0; i < count; i++) {
                String line = br.readLine();
                char[] chars = line.toCharArray();
                StringBuilder result = new StringBuilder();
                for (int j = chars.length - 1; j >= 0; j--) {
                    result.append(chars[j]);
                }
                System.out.println(result);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
