package Extra;

import java.util.Arrays;
import java.util.Scanner;

public class Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt() ;
        int k = scanner.nextInt();
        int[][] arr_bomb = new  int[k][2];
        String[][] array = new String[n][m];
        for (int x = 0 ; x<n ; x++){
            for (int y = 0 ; y<m ; y++){

            }
        }
        for (int i = 0 ; i<k ; i++){
            for(int j = 0 ; j<2 ; j++){
                arr_bomb[i][j] = scanner.nextInt();
                array[i][j] = "*";
            }
        }

    }
}
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int i,j;
        String[][] a = new String[n][m];
        int[][] b = new int[n][m];
        for (int f = 0;f < k; f++) {
            i = scanner.nextInt();
            j = scanner.nextInt();
            a[i-1][j-1]="*";
            if(((i-2)>=0)&&((i-2)<n)&&((j-2)>=0)&&((j-2)<m)) b[i-2][j-2]++;
            if(((i-2)>=0)&&((i-2)<n)&&((j-1)>=0)&&((j-1)<m)) b[i-2][j-1]++;
            if(((i-2)>=0)&&((i-2)<n)&&((j)>=0)&&((j)<m)) b[i-2][j]++;
            if(((i-1)>=0)&&((i-1)<n)&&((j-2)>=0)&&((j-2)<m)) b[i-1][j-2]++;
            if(((i-1)>=0)&&((i-1)<n)&&((j)>=0)&&((j)<m)) b[i-1][j]++;
            if(((i)>=0)&&((i)<n)&&((j-2)>=0)&&((j-2)<m)) b[i][j-2]++;
            if(((i)>=0)&&((i)<n)&&((j-1)>=0)&&((j-1)<m)) b[i][j-1]++;
            if(((i)>=0)&&((i)<n)&&((j)>=0)&&((j)<m)) b[i][j]++;

        }
        for (int l = 0; l < n; l++) {
            for (int l2 = 0; l2 < m; l2++) {
                if("*".equals(a[l][l2]))
                    System.out.print("* ");
                else
                    System.out.print(b[l][l2]+" ");
            }
            System.out.println();
        }

        scanner.close();
    }

}
*/
