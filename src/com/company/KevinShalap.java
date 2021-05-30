package com.company;

import java.util.Scanner;

public class KevinShalap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        double average = 0;
        if (n % 2 == 0){
           average = n*n/((n+1)*(double)4);
        }else {
            average = (n-1)/(double)4;
        }
        System.out.printf("%.6f",average);
    }
}
