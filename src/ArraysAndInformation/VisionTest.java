package ArraysAndInformation;

import java.util.Scanner;

public class VisionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String a1 = scanner.next();
        String a2 = scanner.next();
        int counter = 0;
        for (int i = 0 ; i<n ; i++){
            if (a1.charAt(i)!=a2.charAt(i))
                counter++;
        }
        System.out.println(counter);
    }
}
