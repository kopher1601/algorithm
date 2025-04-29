package s02;

import java.util.Scanner;

/**
Input
8
130 135 148 140 145 150 150 153
 * <p>
 * Output
 * 5
 */
public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int answer = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }
        System.out.println(answer);
    }
}
