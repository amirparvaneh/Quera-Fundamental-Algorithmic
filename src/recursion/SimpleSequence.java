package recursion;

import java.util.Scanner;

public class SimpleSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        fn(n);
        System.out.println(fn(n));
    }
    public static  int fn(int n){
        if ( n == 0 ){
            return 5;
        }else if (n%2==0)
            return fn(n-1)-21;
        else
            return fn(n-1)*fn(n-1);
    }
}

