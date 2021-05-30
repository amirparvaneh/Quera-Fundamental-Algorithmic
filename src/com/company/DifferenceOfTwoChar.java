package com.company;

import java.util.Scanner;

public class DifferenceOfTwoChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x1 = scanner.next();
        String y1 = scanner.next();
        char x = x1.charAt(0);
        char y = y1.charAt(0);
      //  System.out.println((int)x+ "and"+ (int)y);
        System.out.println(y-x);

    }
}
