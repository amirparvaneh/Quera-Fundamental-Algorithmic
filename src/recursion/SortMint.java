package recursion;

import java.util.Scanner;

public class SortMint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0 ; i<n ; i++){
            array[i] = scanner.nextInt();
            sum = sum + array[i];
        }
        System.out.println(sum);
        int average = sum/n;
        System.out.println(average);
    }
    /*static int fn(int n ){
        for (int i = 0 ; i<n ; i++){
            if (i==0)
        }
    }*/
}
