package recursion;

import java.util.Scanner;

public class KhayyamPascalTriangle {
    static final int N=52;
    static boolean [][]seen=new boolean[N][N];
    static long [][]cValue=new long[N][N];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
            {
                System.out.print(C(i,j)+" ");
            }
            System.out.println();
        }
    }
    public static long C(int n,int k)
    {
        if(seen[n][k])return cValue[n][k];
        seen[n][k]=true;
        if(n==k || k==0)return cValue[n][k]=1;
        return cValue[n][k]=C(n-1,k)+C(n-1,k-1);

    }
}