package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Sort2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String[] array = new String[n];
        for (int i = 0 ; i<n ; i++){
            array[i] = scanner.next();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int j = 0 ; j<n ; j++){
            for (int z = j+1 ; z<k;z++){
                System.out.println(lcp(array[j],array[z]));
            }
        }
    }
    static int lcp(String a,String b){
        int ret = 0;
        int x = a.length(), y = b.length();
        int aa = Math.min(x,y);
        for (int i = 0 ; i<aa ; i++){
            if(a.charAt(i)!=b.charAt(i)){
                break;
            }else ret++;
        }
        return ret;
    }
}
