package ArraysAndInformation;


import java.util.Scanner;

public class ReversePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[1000];
        int x = 0;
            for (int i = 0 ; ;i++){
                array[i] = scanner.nextInt();
                x = i;
                if (array[i]==0)break;
            }
            for (int i =x-1; i>=0; i--){
                System.out.println(array[i]);
        }
    }
}

   /*    Scanner scanner = new Scanner(System.in);
        int counter = 0;
        String result = "";
        while (true){
            int n = scanner.nextInt();

            if (n==0)break;
            if (counter==0){
               result = String.valueOf(n);
            }else {
                result = String.valueOf(n)+'\n'+ result;
            }
            counter++;
        }
        System.out.println(result);*/