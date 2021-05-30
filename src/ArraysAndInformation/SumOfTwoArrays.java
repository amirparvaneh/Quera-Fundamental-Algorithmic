package ArraysAndInformation;


import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n>0 && n<100){
            int[] array1 = new int[n];
            int[] array2 = new int[n];
            //int[] result = new int[n];
            int[] result = new int[100];
            for (int i = 0 ; i<n; i++) {
                array1[i] = scanner.nextInt();
            }
            for (int j = 0; j < n; j++) {
                array2[j] = scanner.nextInt();
            }
            for (int i = 0 ; i<n;i++ ){
                result[i]=array1[i]+array2[i];
                System.out.print(result[i]+" ");
            }

        }

    }
}
