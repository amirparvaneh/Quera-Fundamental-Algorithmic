package Extra;

import java.util.Scanner;

public class GlassPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String x=scanner.next();
        String a[]=new String[n];
        String b[]=new String[n];
        for (int i=0;i<n;i++) {
            a[i]=scanner.next();
            b[i]=scanner.next();
        }
        for (int i=0;i<n;i++) {

            if (a[i].charAt(0)==x.charAt(0))  {
                x=b[i];
            } else if (b[i].charAt(0)==x.charAt(0))  {
                x=a[i];
            }
        }
        System.out.println(x);
    }
}
