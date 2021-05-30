package ArraysAndInformation;

import java.util.Scanner;

public class ChangeOfArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[110];
        int lengthOfA = 0;
        for(int i = 0; i < n; i++){
            String inp = scanner.next();
            if(inp.charAt(0) == '+'){
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                lengthOfA ++;
                for(int j = lengthOfA ; j >= index + 1; j--){

                    /// swap a[j], a[j-1]
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                }
                a[index] = value;
            }else{
                int index = scanner.nextInt();
                for(int j = index+1; j <= lengthOfA; j++){
                    /// swap a[j], a[j-1]
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                }
                lengthOfA--;
            }
            if(lengthOfA == 0){
                System.out.println("EMPTY");
            }else{
                for(int j = 1; j <= lengthOfA; j++){
                    System.out.print(a[j]);
                    System.out.print(' ');
                }
                System.out.print("\n");

            }
        }
    }
}