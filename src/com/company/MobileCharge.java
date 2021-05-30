package com.company;

import java.util.Scanner;

public class MobileCharge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int x  = (k*(k+1))/2;
        System.out.println("\n");
        System.out.println(x);
    }
}
