package recursion;

import java.util.Scanner;

public class BinarySearch
{
    static int []a=new int[100*1000+10];
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(),q=scanner.nextInt();
        for(int i=0;i<n;i++)
            a[i]=scanner.nextInt();
        for(int i=0;i<q;i++)
        {
            String tmp=scanner.next();
            int x=scanner.nextInt();
            System.out.println((find(0,n,x)?1:0));
        }
    }

    public static boolean find(int l,int r,int x)
    {
        if(l==r-1)
            return a[l]==x;
        int mid=(l+r)/2;
        if(a[mid]==x)return true;
        if(a[mid]>x)return find(l,mid,x);
        return find(mid,r,x);
    }




}