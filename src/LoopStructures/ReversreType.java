package LoopStructures;

import java.util.Scanner;

public class ReversreType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 0;
        while (n>0){
            num = num * 10;
            num = num + n%10;
            n = n/10;

        }System.out.println(num);
    }
}
