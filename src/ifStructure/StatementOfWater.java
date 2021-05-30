package ifStructure;

import java.util.Scanner;

public class StatementOfWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        String state = "Water";
        if (temp > 100) {
            state = "Steam";
        }else if(temp< 0){
            state = "Ice";
        }else {
            state ="Water";
        }
        System.out.println(state);
    }
}
