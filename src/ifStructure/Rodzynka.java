package ifStructure;

import java.util.Scanner;

public class Rodzynka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        if (x1>x){
            System.out.println("Right");
        }else System.out.println("Left");
    }
}
