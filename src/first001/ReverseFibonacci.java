package first001;

import java.awt.*;
import java.util.Scanner;

public class ReverseFibonacci {
    public static void main(String[] args) {
        System.out.println("enter two number:");
        Scanner sc = new Scanner(System.in);
        int N,N1;
        N = sc.nextInt();
        N1 = sc.nextInt();
        ShowFibNth(N,N1);

    }
    public static void ShowFibNth(int N, int N1){
        if (N==0){
            return;
        }
        System.out.println(N);
        int new_n = N-N1;
        ShowFibNth(new_n,N);
    }

}
