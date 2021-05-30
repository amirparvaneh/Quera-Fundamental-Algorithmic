package ifStructure;

import java.util.Scanner;

public class MaxOf4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(),c = scanner.nextInt()
                , d = scanner.nextInt();
        int maximum = a;
        if (b>maximum )maximum = b;
        if(c>maximum)maximum = c;
        if(d>maximum) maximum = d;
        System.out.println(maximum);
    }
}
   /*int maximum = 0;
        if (a>maximum){
           maximum = a;
        }if (b>maximum){
            maximum = b;
        } if (c> maximum ){
            maximum = c;
        }if (d>maximum){
            maximum = d;
        }
        System.out.println(maximum);*/