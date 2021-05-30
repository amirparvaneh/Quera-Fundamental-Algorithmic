package ArraysAndInformation;
import java.util.Scanner;

public class Lundry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();

        int[] dry = new int[2000], ptr = new int[2000];

        while(true) {
            String id = scanner.next();
            if(id.equals("put")) return ;
            int i = Integer.parseInt(id);
            String q = scanner.next();
            if(q.equals("give")) {
                int p = ptr[i];
                if(p == 0) System.out.println("no towel has been assigned to me.");
                else if(dry[p] == 0) {
                    System.out.println("ok");
                    dry[p] = 10;
                }
                else System.out.println("impossible");
            }else if(q.equals("dry")) {
                int x = scanner.nextInt();
                int p = ptr[i];
                if(p == 0) System.out.println("no towel has been assigned to me.");
                else dry[p] -= x;
                if(dry[p] < 0) dry[p] = 0;
            }else if(q.equals("output")) {
                int p = ptr[i];
                if(p == 0) System.out.println("no towel has been assigned to me.");
                else System.out.println(dry[p]);
            }else {
                int p = scanner.nextInt();
                ptr[i] = p;
            }
        }
    }

}

