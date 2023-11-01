import java.util.Scanner;

public class Alba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int basePay = input.nextInt();
        int workingHours = input.nextInt();
        int pay = basePay * workingHours;

        System.out.println(pay);
    }
}
