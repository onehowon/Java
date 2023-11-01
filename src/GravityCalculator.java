import java.util.Scanner;

public class GravityCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gravity = -9.81;
        double fallingTime = input.nextDouble();
        double initialPosition = 1000.0;

        double finalPosition = 0.5 * gravity*gravity + fallingTime + initialPosition;

        System.out.printf("%.2f 초 후, 물체의 고도는 %.2f m\n", fallingTime, finalPosition);
    }
}

// 식 x(t) = 0.5 * at^2 + vit + xi
