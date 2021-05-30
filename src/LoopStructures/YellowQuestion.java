package LoopStructures;

import java.util.Scanner;

public class YellowQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("W");
        for (int i = 1; i <= n ; i++){
            System.out.print("o");

        }
        System.out.print("w!");
    }
}
