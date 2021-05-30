package ArraysAndInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class StreamMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt(), L = scanner.nextInt();
        String s = "1";
        for (int i = 0 ; ; i++){
            if (s.length()>=L)break;
            String t ="";
            for (int j = 0 ; j<s.length();j++){
                if (s.charAt(j)=='1'){
                    t+='0';
                }else t+='1';
            }
            s+=t;
        }
        for (int i = R-1; i<=L-1 ; i++){
            System.out.println(s.charAt(i));
        }
    }
}//
/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();

        displaySubString(l,r);

    }
    //
    public static void displaySubString(int l , int r){

        String output = getBinaryString(r);
        String result = output.substring(l - 1,r);
        System.out.println(result);
    }
    //
    public static String getBinaryString(int r){

        StringBuilder result = new StringBuilder();

        result.append('1');

        while (result.length() < r){
            int length = result.length();

            for(int j = 0 ; j < length ; j++){

                if (result.charAt(j) == '0')
                    result.append('1');
                else if (result.charAt(j) =='1')
                    result.append('0');
            }
        }
        return result.toString();
    }


}*/

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int l=scanner.nextInt(),r=scanner.nextInt();
        String s="1";
        for(int i=0;;i++)
        {
            if(s.length()>=r)break;
            String t="";
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='1')t+='0';
                else t+='1';
            }
            s+=t;
        }
        for(int i=l-1;i<=r-1;i++)
            System.out.print(s.charAt(i));
    }
}*/
