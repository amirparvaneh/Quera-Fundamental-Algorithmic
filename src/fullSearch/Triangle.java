package fullSearch;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0;
        int shak = n/3;
        //System.out.println(shak);
        for (int a=1 ; a<=(n/3) ;a++){
            int y =(n-(3*a))/2;
            //System.out.println(y);
            int f = (Math.max(0,(n/2)-((2*a)+1))+1);
            //System.out.println(f);
           answer = answer + ( y - f)+1;
        }
        System.out.println(answer);
    }
}
