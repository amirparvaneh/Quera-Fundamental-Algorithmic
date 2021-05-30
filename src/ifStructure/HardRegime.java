package ifStructure;

import java.util.Scanner;

public class HardRegime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char a1 = str.charAt(0);
        char a2 = str.charAt(1);
        char a3 = str.charAt(2);
        char a4 = str.charAt(3);
        char a5 = str.charAt(4);
        int G =0;
        int Y=0;
        int R=0;
        int i = 0;
        int[] array = {a1,a2,a3,a4,a5};
        while (i<5){
            if (array[i]=='G')G +=1;
            else if (array[i]=='Y')Y +=1;
            else R+=1;
            i++;
        }if (R >=3 ||(R>=2&&Y>=2) || G == 0 ){
            System.out.println("nakhor lite");
        }else System.out.println("rahat baash");
        /*if (a1=='G')G +=1;
        else if (a1=='Y')Y+=1;
        else R +=1;
        if (a2=='G')G +=1;
        else if (a2=='Y')Y+=1;
        else R +=1;
        if (a3=='G')G +=1;
        else if (a3=='Y')Y+=1;
        else R +=1;
        if (a4=='G')G +=1;
        else if (a4=='Y')Y+=1;
        else R +=1;
        if (a5=='G')G +=1;
        else if (a5=='Y')Y+=1;
        else R +=1;
        if (R >=3 ||(R>=2&&Y>=2) || G == 0 ){
            System.out.println("nakhor lite");
        }else System.out.println("rahat baash");*/
    }
}
