package com.company;

import java.util.Scanner;

public class ProChess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shah = 1, vazir= 1 , rokh = 2 , fil = 2 ,
                horse = 2 , soldier = 8;
        int scanner_shah = scanner.nextInt();
        int scanner_vazir = scanner.nextInt();
        int scanner_rokh = scanner.nextInt();
        int scanner_fil = scanner.nextInt();
        int scanner_horse = scanner.nextInt();
        int scanner_soldier = scanner.nextInt();
        int a1 = shah - (int)scanner_shah;
        int a2 = vazir - (int)scanner_vazir;
        int a3 = rokh - (int)scanner_rokh;
        int a4 = fil - (int)scanner_fil;
        int a5 = horse - (int)scanner_horse;
        int a6 = soldier - (int)scanner_soldier;
        System.out.println(a1+" "+a2+" "+a3+" "+a4+" "+a5+" "+a6);
    }
}
