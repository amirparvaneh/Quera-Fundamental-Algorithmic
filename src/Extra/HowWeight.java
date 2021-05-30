package Extra;

import java.util.Scanner;

public class HowWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();
        float height = scanner.nextFloat();
        if (weight<0||weight>200){
            return;
        }
        if (height<1||height>10)return;
        float BMI = weight / (height * height);
        System.out.printf("%.2f",BMI);
        System.out.println();
        if(BMI < 18.5)
        System.out.println("Underweight");
        else if(BMI >= 18.5 && BMI < 25)
        System.out.println("Normal");
        else if(BMI >= 25 && BMI < 30)
        System.out.println("Overweight");
        else if(BMI >30)
        System.out.println("Obese");
    }
}
