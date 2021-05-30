package Extra;

import java.util.Scanner;

public class Reversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String a ;
        a = scanner.nextLine();
        String[] b  = a.split(" ");

        for (int i = b.length-1 ; i>=0 ; i--){
            System.out.print(b[i]);
        }
    }
}
