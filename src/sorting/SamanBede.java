package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class SamanBede {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        String[] names = new String[n];
        for (int i=0; i<n; i++)
            names[i] = scanner.next();

        Arrays.sort(names);

        int ans = 1;
        for (int i=0; i<n; i++) {
            int j = i + 1;
            while(j < n && lcp(j, j - 1, names) >= k) j++;
            ans = Math.max(ans, j - i);
        }
        System.out.println(ans);
    }

    private static int lcp(int id1, int id2, String[] names) {
        int x = 0;
        int l1 = names[id1].length(), l2 = names[id2].length();
        while(x < l1 && x < l2 && names[id1].charAt(x) == names[id2].charAt(x)) x++;
        return x;
    }

}
