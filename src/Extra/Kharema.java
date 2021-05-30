package Extra;

import java.util.Scanner;

public class Kharema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int a = n/2;
        int dif = n-k;
        if (k<=a){
            for (int i = 1 ; i<=n ; i++){
                for (int j = n ; j>0 ; j++){
                    if (j-i>=k){
                        System.out.print(i + " ");
                    }
                }
            }
        }else System.out.println("Impossible");
    }
}

