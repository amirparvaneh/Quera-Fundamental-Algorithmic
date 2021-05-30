package com.company;
import java.util.Scanner;
//why this is working???
public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.printf("%02d:%02d",(12-h) % 12 ,(60 - m) % 60);
        scanner.close();
    }
}
/*import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a> 0 && a<=12 && b>0 && b<=59){
            int hour = (12 - a);
            int minute = (60 -b);
            System.out.printf("%02d:%02d",hour,minute);
        }else return;
    }
}*/
/*Scanner s = new Scanner(System.in);
    int h = s.nextInt() , m = s.nextInt() ;
        if ( m==0 )
                m = 0 ;
                else
                m = 60 - m ;
                if ( h==0 )
                h = 0 ;
                else
                h = 12 - h ;
                System.out.printf("%02d:%02d", h, m);
                }*/

