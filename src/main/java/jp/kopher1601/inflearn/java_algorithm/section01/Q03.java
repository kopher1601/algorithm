package jp.kopher1601.inflearn.java_algorithm.section01;

/*
가장 긴 단어 출력

Input : it is time to study
Output : study
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            String[] strings = line.split(" ");

            String result = "";
            int m = Integer.MIN_VALUE;
            for (String str : strings) {
                int length = str.length();
                if (length > m) {
                    m = length;
                    result = str;
                }
            }
            System.out.println(result);
        }
    }
}
