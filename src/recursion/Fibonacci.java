package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[101];
        array[0] = 1;
        array[1] = 2;
        for (int i = 2; i < 100; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        int j = 0;
        for (int i = 1 ; i <=n ; i++) {
            if (i == array[j]) {
                System.out.print("+");
                j++;
            }else System.out.print("-");
        }
    }
}
/*
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        boolean []isFib=new boolean[101];
        for(int i=1;;i++)
        {
            int x=fib(i);
            if(x>n)break;
            isFib[x]=true;
        }
        for(int i=1;i<=n;i++)
        {
            if(isFib[i]) System.out.print("+");
            else System.out.print("-");
        }

    }

    private static int fib(int x)
    {
        if(x==1)return 1;
        if(x==2)return 2;
        return fib(x-1)+fib(x-2);
    }


}*/
