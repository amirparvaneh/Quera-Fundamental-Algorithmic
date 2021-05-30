package LoopStructures;

import java.util.Scanner;

public class PopakDream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt() , y = scanner.nextInt() , z = scanner.nextInt() , s=0;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++)
                if(x%i==0&&y%j==0&&(i+j)<=z)
                    s++;
        }
        System.out.println(s);
       /* int a = scanner.nextInt(),b = scanner.nextInt(),x =scanner.nextInt();
        int D = 1;
        int counter = 0;
        for (int i = 1 ; i<=a ; i++)
                if (a % i == 0)
                    for(int j = 1 ;j <= b;j++)
                        if (b % j == 0)
                            if (a+b <=x)
                                counter++;
        System.out.println(counter);*/
    }

}
