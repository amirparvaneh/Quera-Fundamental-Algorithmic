package LoopStructures;

import java.util.Scanner;

public class BagherCheragh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() , l = scanner.nextInt();
        int x = 0, t = 0;
        for (int i = 0 ;i < n ; i++){
            int d = scanner.nextInt(), r = scanner.nextInt(), g = scanner.nextInt();
            t += d-x;
            x = d;
            while (t % (r+g) < r )
                ++t;
        }
        t += l-x;
        x = l;
        System.out.println(t);
    }
}
