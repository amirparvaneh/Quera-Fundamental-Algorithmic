package Extra;

import java.util.Scanner;

public class SimpleContest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt() , n = scanner.nextInt();
        int birthDay = factorial(k);
        System.out.println(birthDay);
        String birthfactorial = String.valueOf(birthDay);
        int q = birthfactorial.length();
        int ans = 0 ;
        for (int i = 0 ; i<q ; i++){
            if (birthfactorial.charAt(i)==Character.valueOf(n)){
                ans++;
            }
        }
        System.out.println(ans);
    }
    static int factorial(int n){
        int fact = 1;
        int number=n;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }
    /*static int factorial(int n ){
        if (n==1){
            return 0;
        }else {
            return n*factorial(n-1);
        }
    }*/
}
