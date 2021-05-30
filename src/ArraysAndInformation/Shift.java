package ArraysAndInformation;

import java.util.Scanner;

public class Shift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp;
        int n = scanner.nextInt(), x = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0 ; i<n ; i++){
            array[i] = scanner.nextInt();
        }

        //System.out.println(Arrays.toString(array));
        int counter= 0;
        while (counter<x){
            temp=array[n-1];
            for(int i=n-1;i>0;i--)
            {
                array[i]=array[i-1];
            }
            array[0]=temp;
            counter++;
        }
        for (int i = 0 ; i<n ; i++){
            System.out.print(array[i]+" ");
        }

    }


}
