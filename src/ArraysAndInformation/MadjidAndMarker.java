package ArraysAndInformation;

import java.util.Scanner;

public class MadjidAndMarker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array_color = new int[101];
            for (int i = 0 ; i<n; i++){
                int x = scanner.nextInt();
                array_color[x]++;
            }
            int min = -1;
            for (int i = 0 ;i<100;i++){
                if (array_color[i]>0 &&(min==-1||array_color[i]<array_color[min])){
                    min = i;
                }
            }
        System.out.println(min);
    }
}
/*
-----------------------
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []cnt=new int[101];
        for(int i=0;i<n;i++)
        {
            int x=scanner.nextInt();
            cnt[x]++;
        }
        int minId=-1;
        for(int i=1;i<=100;i++)
            if(cnt[i]>0 && (minId==-1 || cnt[i]<cnt[minId]))
                minId=i;
        System.out.println(minId);
    }
}*/
