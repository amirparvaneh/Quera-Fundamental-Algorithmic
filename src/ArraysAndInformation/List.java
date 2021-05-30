package ArraysAndInformation;

import java.util.Scanner;

public class List{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0 ; i<n ; i++){
            list[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        for (int query = 0 ; query<q ; q++){
            int l,r;
            l = scanner.nextInt();
            r = scanner.nextInt();
            l--;
            r--;
            for (int i = 0 ; i<= (r-l)/2 ; i++){
                int temp = list[l+i];
                list[l+i] = list[r-i];
                list[r-i] = temp;
            }
            for (int i = 0 ; i<n ; i++){
                System.out.print(list[i]);
                System.out.print(' ');
            }
            System.out.println('\n');
        }
    }
}
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        for(int query = 0; query < q; query++){
            int l, r;
            l = scanner.nextInt();
            r = scanner.nextInt();
            l--;
            r--;
            // make it zero-based
            /// now we want to reverse [l,r]
            for(int i = 0; i <= (r-l)/2; i++){
                /// swap(a[l+i], a[r-i])
                int tmp = a[l+i];
                a[l+i] = a[r-i];
                a[r-i] = tmp;
            }
            for(int i = 0; i < n; i++){
                System.out.print(a[i]);
                System.out.print(' ');
            }
            System.out.print('\n');
        }


    }
}
*/


