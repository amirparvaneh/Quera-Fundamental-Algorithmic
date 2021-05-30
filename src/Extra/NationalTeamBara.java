package Extra;

import java.util.Scanner;

public class NationalTeamBara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt(), b = scanner.nextInt() , c = scanner.nextInt();
        int farhad_in = scanner.nextInt(), farhad_out =scanner.nextInt(),
         sahar_in = scanner.nextInt(), sahar_out =scanner.nextInt(),
         shadi_in = scanner.nextInt(), shadi_out =scanner.nextInt();
        int min = Math.min(Math.min(farhad_in, sahar_in), shadi_in),
                max = Math.max(Math.max(farhad_out, sahar_out), shadi_out);
        long s = 0 ;
        for (int i=min ; i<=max ;i++){
            int count = 0 ;
            if (i>= farhad_in && i<farhad_out){
                count++;
            }
            if (i>= sahar_in && i< sahar_out){
                count++;
            }
            if (i>= shadi_in && i< shadi_out){
                count++;
            }
            switch (count) {
                case 1:
                    s += a;
                    break;
                case 2:
                    s += (2 * b);
                    break;
                case 3:
                    s += (3 * c);
                    break;
            }
        }
        System.out.println(s);


    }
}

/*
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int a1 = in.nextInt(), a2 = in.nextInt(), b1 = in.nextInt(), b2 = in.nextInt(), c1 = in.nextInt(), c2 = in.nextInt();
        int min = Math.min(Math.min(a1, b1), c1), max = Math.max(Math.max(a2, b2), c2);
        long res = 0;
        for (int i = min; i <= max; i++) {
            int count = 0;
            if (i >= a1 && i < a2) {
                count++;
            }
            if (i >= b1 && i < b2) {
                count++;
            }
            if (i >= c1 && i < c2) {
                count++;
            }
            switch (count) {
                case 1:
                    res += a;
                    break;
                case 2:
                    res += (2 * b);
                    break;
                case 3:
                    res += (3 * c);
                    break;
            }
        }
        System.out.println(res);
    }
}*/
