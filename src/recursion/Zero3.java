package recursion;
import java.util.Scanner;

public class Zero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fn(n));

    }
    public static int fn(int n){
        if (n==0){
            return 1;
        }
        if (n==1){
            return 2;
        }
        if (n==2){
            return 4;
        }
        return fn(n-1) + fn(n-2) + fn(n-3);
    }
}
/*
    public static int f(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 2;
        if (n == 2)
            return 4;
        return f(n - 1) + f(n - 2) + f(n - 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(f(n));*/