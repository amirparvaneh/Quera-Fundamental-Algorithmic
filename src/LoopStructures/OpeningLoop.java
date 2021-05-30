package LoopStructures;

import java.util.Scanner;

public class OpeningLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n > 0) {
            sum = sum +n;
            n = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
