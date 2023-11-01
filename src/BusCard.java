import java.util.Scanner;

public class BusCard {
    public static String getRole(int age) {
        /* 이곳을 작성해주세요 */
        if(age>=18){
            return "성인입니다.";
        }else if(age>=13){
            return "청소년입니다.";
        }else if(age>=6){
            return "어린이입니다";
        }else if(age<=5){
            return "유아입니다.";
        }else
            return "";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        String role = getRole(age);
        System.out.println(role);
    }
}
