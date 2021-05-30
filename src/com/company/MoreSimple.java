package com.company;

import java.util.Scanner;

public class MoreSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double sum = (a + b + c + d);
        double average = (a + b + c + d) / 4;
        double product = (a * b * c * d);
        double x = Math.max(a,b);
        double x2 = Math.max(x,c);
        double Max = Math.max(x2,d);
        double y= Math.min(a,b);
        double y2 = Math.min(y,c);
        double Min = Math.min(y2,d);
        System.out.printf("Sum : %.6f\n", sum);
        System.out.printf("Average : %.6f\n", average);
        System.out.printf("Product : %.6f\n", product );
        System.out.printf("Max : %.6f\n", Max );
        System.out.printf("Min : %.6f\n", Min );

    }
}
