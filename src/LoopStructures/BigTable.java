package LoopStructures;

import java.util.Scanner;

public class BigTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;
        for (int i = 1 ; i<= n ; i++){
            for (int j = 1 ; j <= n; j++){
                x = i*j;
                System.out.print(x);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
