package ArraysAndInformation;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionArray {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt(),m =scanner.nextInt();
        int[][]A = new int[n][m];
        int[][]B = new int[n][m];
        int C[][]=new int[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                A[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                B[i][j] = scanner.nextInt();
            }
        }


         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();//new line
        }
    }
}
