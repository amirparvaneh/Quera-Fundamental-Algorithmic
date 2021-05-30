package Extra;

import java.util.Scanner;

public class Guess {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        boolean flag = false;
        int count=0;
        for (int i = 1; i <= 1000; i++) {
            flag = false;
            for (int j = 0; j < a.length; j++) {
                if (i % a[j] != 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
    }
}