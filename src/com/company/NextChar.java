package com.company;

import java.util.Scanner;

public class NextChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch = str.charAt(0);
        int id = (int)ch + 1;
        System.out.println((char)id);
    }
}
