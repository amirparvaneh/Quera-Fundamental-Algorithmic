package ifStructure;

import java.util.Scanner;

public class Tired {
    public static void main(String[] args) {
        int reverse_num1 = 0;
        int reverse_num2 = 0;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y= scanner.nextInt();
        int xx = x;
        int yy = y;
        while( x != 0){
            reverse_num1 = reverse_num1*10;
            reverse_num1 = reverse_num1 + x%10;
            x = x/10;
        }
        while( y != 0){
            reverse_num2 = reverse_num2*10;
            reverse_num2 = reverse_num2 + y%10;
            y = y/10;
        }
        if (reverse_num1>reverse_num2){
            System.out.println(yy+" < "+xx);
        }else if (reverse_num2>reverse_num1){
            System.out.println(xx+" < "+yy);
        }else System.out.println(xx+" = "+yy);
    }
}