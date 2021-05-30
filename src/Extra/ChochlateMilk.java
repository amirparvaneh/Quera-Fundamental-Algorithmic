package Extra;

import java.util.Scanner;

public class ChochlateMilk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0;
        for (int i = 0; i<n;i++){
            int milk = scanner.nextInt();
            if (milk<0 && answer<(-1)*milk){
                answer = 0;
            }else {
                answer = answer + milk;
            }

        }
        if (answer<0){
            answer =0;
        }
        System.out.println(answer);
    }
}
