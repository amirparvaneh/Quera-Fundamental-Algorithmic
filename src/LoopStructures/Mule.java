package LoopStructures;

import java.util.Scanner;

public class Mule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt(), s = -1;
        if (x == y) {
            if (x % 2 == 0 && x == y)
                System.out.println(x + y);
            else if (x % 2 == 1 && y % 2 == 1)
                System.out.println((x + y) - 1);
        } else if (x > y && x - y == 2) {
            if (x % 2 == 0)
                System.out.println(x + y);
            else if (x % 2 == 1)
                System.out.println((x + y) - 1);
        } else
            System.out.println(s);
    }
}
    /*    int x = scanner.nextInt(), y = scanner.nextInt();
        int t = 0;
        if (y>x)t = -1;
        if(x==y){
            if (x==1){
                t = 1;
                //System.out.println(t);
            }
            if (y %2 != 0){
                t = (y*2)-1;
                //System.out.println(t);
            }else t = y*2;
            //System.out.println(t);
        }
        if (x > y){
            if (x==2){
                t = 2;
                //System.out.println(t);
            }else t = -1;
            if (y%2 != 0){
                t = (y*2)+1;
            }else t=(y*2)+2;
        }
        System.out.println(t);*/
               /* int xx = scanner.nextInt();
                int yy = scanner.nextInt();
                int x =0;
                int y =0;
                boolean found = false;
                for(int i = 0; i< xx + yy; i++) {
                    if(i % 4 == 0) {
                        x++;
                        y++;
                    } else if( i % 4 == 1) {
                        x++;
                        y--;
                    } else if( i % 4 == 2) {
                        x++;
                        y++;
                    } else if( i % 4 == 3) {
                        x--;
                        y++;
                    }
                    if(x == xx && y == yy) {
                        System.out.println(i+1);
                        found = true;
                        break;
                    }
                }

                if(!found)
                    System.out.println(-1);

                scanner.close();
            }
        }*/
