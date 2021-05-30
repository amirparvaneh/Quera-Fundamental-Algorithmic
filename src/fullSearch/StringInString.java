package fullSearch;
import java.util.Scanner;

public class StringInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String p = scanner.next();
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            boolean flag = true;
            for (int j = 0; j < p.length(); j++) {
                if (s.charAt(i + j) != p.charAt(j))
                    flag = false;
            }
            if (flag)
                System.out.print(i + 1 + " ");
        }
        System.out.println();
    }
}
