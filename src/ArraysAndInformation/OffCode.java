package ArraysAndInformation;
import java.util.Scanner;
public class OffCode {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String t=scanner.next();
        for(int i=0;i<n;i++){
            String s=scanner.next();
            boolean areSame=true;
            for(int j=0;j<s.length();j++){
                boolean tHasIt=false;
                for(int k=0;k<t.length();k++)
                    if(t.charAt(k)==s.charAt(j)){
                        tHasIt=true;
                        break;
                    }
                if(!tHasIt){
                    areSame=false;
                    break;
                }
            }
            for(int j=0;j<t.length();j++){
                boolean sHasIt=false;
                for(int k=0;k<s.length();k++)
                    if(s.charAt(k)==t.charAt(j)){
                        sHasIt=true;
                        break;
                    }
                if(!sHasIt){
                    areSame=false;
                    break;
                }
            }
            if(areSame) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}