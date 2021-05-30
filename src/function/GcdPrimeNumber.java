package function;

import java.util.Scanner;

public class GcdPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 1;
        int n = scanner.nextInt();
        for (int i = 1 ; i<=n ; i++)
            if (gcd(i,n)==1)
                ans = lcd(ans,i);
                System.out.println(ans);


    }

   static int gcd(int n1 , int n2){
       for(int i=n1+n2;i>=1;i--)
           if(n1%i==0 && n2%i==0)
               return i;
       return 1;
        /*int result = 1;
        for (int i = 1 ; i<=n1 && i<n2 ; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                result = i;
            }
        }return result;*/
    }
    static int  lcd(int n1, int n2) {
        return (n1 * n2) / gcd(n1, n2);
    }


}
