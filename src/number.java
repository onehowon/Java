import java.util.Scanner;

public class number {

    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        System.out.println("숫자를 입력하세요");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        while(num!=0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("각 자리수 합은 " + sum);
        input.close();



    }
}
