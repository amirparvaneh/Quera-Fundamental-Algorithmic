package recursion;

import java.util.Scanner;

public class ReversPrintRecursion {
        static Scanner scanner=new Scanner(System.in);
        public static void main(String[] args)
        {
            function();
        }

        static void function()
        {
            int x=scanner.nextInt();
            if(x==0)return ;
            function();
            System.out.println(x);
        }
}
