package ArraysAndInformation;

import java.util.Scanner;

public class Andoist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[] array = new int[200 + 10];
        for (int i =  0 ; i < q ; i++ ){
            String s  = scanner.next();
            int x = scanner.nextInt();
            if (s.equals("+")){
                array[x]++;
            }else {
                System.out.println(array[x]);
            }
        }
    }
}

/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counter = new int[200 + 10];
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String tp = scanner.next();
            int x = scanner.nextInt();
            if (tp.equals("+")) {
                counter[x]++;
            } else {
                System.out.println(counter[x]);
            }
        }
    }
}*/
