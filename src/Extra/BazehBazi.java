package Extra;

import java.util.Scanner;

public class BazehBazi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        double L = 0   ;
        double R = Math.pow(10,9);
        while (L!=R){
            double mid = (L+R+1)/2;
            if (check(a,k, mid)==true){
                L = mid;
            }else R = mid -1;
        }
        System.out.println(L);
    }
    public static boolean check( int[]a, int k, double x){
        int consecutive_elements = 0;
        boolean answrer = false;
        for(int i = 0 ; i< a.length ; i++){
            if (a[i]>=x ){
                consecutive_elements = consecutive_elements +1;
            }else {
                consecutive_elements = 0;
            }
            if (consecutive_elements == k){
                answrer = true;
            }
            return answrer;
        }
        return answrer;
    }
}
