package com.company;

import java.util.Scanner;

public class DrawRoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%2 == 0){
            int a = n/2 ;
            //int b = a+1;
            int result = (a*a)+(n+1);
            System.out.println(result);
        }else{
            int a = n/2;
            int b = a+1;
            int result = (a*b)+(n+1);
            System.out.println(result);
        }
    }
}
