import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double tall){
        // 해당 메소드를 구현하세요
        return weight / (tall * tall);
    }
    public static void printBMIClassification(double bmi){
        // 해당 메소드를 구현하세요
        if(bmi > 30)
            System.out.println("비만입니다.");
        else if(bmi >= 25)
            System.out.println("과체중입니다.");
        else if(bmi >= 18.5)
            System.out.println("정상입니다.");
        else
            System.out.println("저체중입니다.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double tall = input.nextDouble();

        double bmi = calculateBMI(weight, tall);
        printBMIClassification(bmi);
    }
}
