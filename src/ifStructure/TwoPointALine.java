package ifStructure;

import java.util.Scanner;

public class TwoPointALine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt(), y1 = scanner.nextInt(),
                x2 = scanner.nextInt(),
                y2 = scanner.nextInt();
        if (x1 == x2)System.out.println("Vertical");
        if (y1 == y2) System.out.println("Horizontal");
        if (x1 != x2 && y1 !=y2) System.out.println("Try again");
    }
}
