package LoopStructures;

import java.util.Scanner;

public class OneDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringNumber = scanner.nextLine();
        long m = 0;
        long n = Long.parseLong(stringNumber);
        while (n>=10){
            long sum = 0;
            while (n>0){
                m =  n%10;
                sum = sum + m;
                n = n/10;
            }
            n = sum;
        }
        System.out.println(n);
    }
}
