package recursion;
import java.util.Scanner;

public class BeautifullKokh {
    static int n;
    static final double sq3=1.73205080;
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        f(0,500,sq3*1000/2,1000,0);
    }

    static void f(int step, double x, double y, double len, int edge)
    {
        if(step==n)
        {
            if(edge!=1)
            {
                if(step%2==0)y-=len*sq3/2;
                else y+=len*sq3/2;
            }
            if(edge==2)x-=len/2;
            if(edge==3)x+=len/2;
            System.out.printf("%.6f %.6f\n",x,y);
            return ;
        }
        double x1,y1;
        x1=x;
        if(step%2==0)y1=y-len*sq3/2-len*sq3/6;
        else y1=y+len*sq3/2+len*sq3/6;
        f(step+1,x1,y1,len/3,1);
        double x2,y2;
        x2=x-len/3;
        if(step%2==0)y2=y-len*sq3/3;
        else y2=y+len*sq3/3;
        f(step+1,x2,y2,len/3,2);
        double x3,y3;
        x3=x+len/3;
        y3=y2;
        f(step+1,x3,y3,len/3,3);
    }


}