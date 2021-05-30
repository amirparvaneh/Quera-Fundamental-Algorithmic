package recursion;

import java.util.Scanner;

public class TowerOfHanoi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        towerOfHanoi(n , 'A', 'B' , 'C');
    }
    static void towerOfHanoi(int n , char from ,char to , char help){
        if (n==1){
                System.out.println( " "+ from + " " + to);
        }else {
            towerOfHanoi(n-1,from,to,help);
            towerOfHanoi(n-1,help,to,from);
        }
    }
}