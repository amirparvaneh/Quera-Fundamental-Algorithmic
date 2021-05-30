package ArraysAndInformation;

import java.util.Arrays;
import java.util.Scanner;

public class ShekarAbadSky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int answer = 0;
        for (int i = 0 ;i<n ; i++){
            String str = scanner.next();
            for (int j = 0 ; j<m ; j++){
                if (str.charAt(j)=='*')answer++;
            }
        }
        System.out.println(answer);
    }
}