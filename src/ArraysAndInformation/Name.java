package ArraysAndInformation;

import java.util.Arrays;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y' ,'z'};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] array = new String[0];
        String str;
        int tempCount=0;
        int counter=0;
        int maxCounter=0;
        int tempLength=0;
        for (int i = 0 ; i<=n ; i++){
            str = scanner.nextLine();
            char[] ch = new char[str.length()];
            for (int j = 0;j<str.length();j++){
                ch[j] =str.charAt(j);
            }
            for (int z = 0 ; z<chars.length;z++){
                tempCount = str.replace(String.valueOf(ch[z]), "").length();
                if(tempCount==tempLength)
                    continue;
                counter++;
                tempCount=0;
            }
        }

    }
}
