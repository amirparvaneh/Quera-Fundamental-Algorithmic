package LoopStructures;

import java.util.Scanner;

public class XTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        while (X>0){
            for (int i =1 ; i<=X ; i++) {
                System.out.println(X);
            }
            X = scanner.nextInt();
            }
    }
}
