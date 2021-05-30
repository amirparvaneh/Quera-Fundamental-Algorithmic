package function;
import java.util.Scanner;

public class ShayanAndRock{

    static int maxN = 2 * 10000 * 100 + 10;

    static boolean[] notPrime = new boolean[maxN];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        init();
        int n = scanner.nextInt();
        int price = 0;
        for (int i=0 ; i<n; i++) {
            int x = scanner.nextInt();
            price += cost(x);
        }

        if(!notPrime[price]) {
            int count = 0;
            for (int i=2; i<price; i++)
                if(!notPrime[i]) count ++;
            price -= count;
        }else {
            int count = 0;
            for (int i=2; i<price; i++)
                if(price % i == 0 && !notPrime[i]) count ++;
            price -= count;
        }

        System.out.println(price);

    }

    static void init() {
        notPrime[1] = true;
        for (int i=2; i<maxN; i++){
            if(!notPrime[i]) {
                for (int j=2*i; j<maxN; j+=i)
                    notPrime[j] = true;
            }
        }
    }

    static int cost(int x) {
        if(!notPrime[x]) {
            int ans = 0;
            for (int i=1; i<x; i++)
                if(!notPrime[i]) ans ++;
            return ans;
        }else {
            int ans = 0;
            for (int i=2; i<x; i++)
                if(x % i == 0 && !notPrime[i])
                    ans ++;
            return ans;
        }
    }

}
