package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Shengdobad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[] gap = new int[5000];
        String[][] array = new String[q][2];
        for (int i = 0 ; i< q ; i++){
            for (int j = 0 ; j<=2 ; j++){
                array[i][j] = scanner.nextLine();
            }
        }
        for (int i = 0 ; i < q ; i++){
            if (array[i][0]=="ask"){
                System.out.println(array[i][2]);
            }
            if (array[i][0]=="add"){
                gap[i] = Integer.parseInt(array[i][0]);
            }
        }insertionSort(gap);
        System.out.println(gap);
    }
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
}
