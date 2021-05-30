package Extra;

import java.util.Arrays;
import java.util.Scanner;

public class HelpToCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String[] inp_arr = inp.split(" ");
        for (int i = 1; i <= Integer.parseInt(inp_arr[0]);i++)
        System.out.print("copy of ");

        System.out.print(inp_arr[0]);
        /*int n = scanner.nextInt();
        String string = scanner.nextLine();
        String virus = "copy of";
        for (int i = 0 ; i<n ; i++){
            System.out.print(virus+" ");
        }*/
    }
}
