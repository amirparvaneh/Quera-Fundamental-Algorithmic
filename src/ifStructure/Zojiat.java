package ifStructure;

import java.util.Scanner;

public class Zojiat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(), B = scanner.nextInt(),
                C = scanner.nextInt();
        if (A%2==0 || (C % 2 ==0 && B %2 ==0)){
            System.out.println("good");
        }else System.out.println("bad");
    }
}
