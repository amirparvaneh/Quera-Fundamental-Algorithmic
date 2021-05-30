package Extra;

import java.util.Scanner;

public class BetterLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt(), c =scanner.nextInt();
        r =  11-r ;
        if (r<11){
            System.out.println("Left"+" "+r+" "+c);
        }else {
            c = 21 - c;
            System.out.println("Right"+" "+"r"+" "+c);
        }
    }
}
