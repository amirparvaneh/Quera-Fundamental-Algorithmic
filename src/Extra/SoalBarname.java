package Extra;
import java.util.Scanner;

public class SoalBarname {
    public static void main(String[] arg) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            String[] s = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = input.next();
            }
            int q = n - 1;
            String[] f = new String[n];
            for (int k = 0; k < n; k++) {
                f[k] = s[q];
                System.out.print(f[k]);
                //space
                System.out.print(" ");
                q--;
            }

        }
}
