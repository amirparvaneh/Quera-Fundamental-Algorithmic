package ArraysAndInformation;

import java.util.Arrays;
import java.util.Scanner;

public class SnapInShekarestan {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array_cost = new int[n][n];
        for (int i =0 ; i<n; i++){
            for (int j = 0 ; j<n ;j++){
                array_cost[i][j] = scanner.nextInt();
            }
        }
        //System.out.println("first array done");
        int sum = 0;
        for (int i = 0;i<m ; i++){
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            sum = sum + array_cost[x1-1][y1-1];
           // System.out.println(array_cost[x1-1][y1-1]);
           // System.out.println(sum);

        }
        System.out.println(sum);

   }
}
