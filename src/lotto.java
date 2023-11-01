import java.util.Random;
import java.util.Scanner;

public class lotto {
    public static void main(String[] args) {
        printRightNumbers();
        }
        public static int generateRandNum(){
        return new Random().nextInt(45) + 1;
    }

    public static int[] lotteryNumbersArray(){
        int i = 0;
        int[] realarray = new int[6];
        int[] delarray = deleteNumbersArray();

        while(i<6){
            int randnum = generateRandNum();
            for(int j = 0; j < delarray.length; j++){
                if(randnum == delarray[j])
                    continue;
            }
            for(int j = 0; j < realarray.length; j++){
                if(randnum == realarray[j])
                    continue;
            }
            realarray[i] = randnum;
            i++;
        }
        return realarray;
    }
    public static int[] deleteNumbersArray(){
        Scanner input = new Scanner(System.in);
        int i = 0;
        int[] delarray = new int[5];
        System.out.println("제거할 숫자들: ");
        while(i<5){
            int num = input.nextInt();
            delarray[i] = num;
            i++;
        }
        return delarray;
    }

    public static void printRightNumbers() {
        int[] realarray = lotteryNumbersArray();
        for (int i = 0; i < realarray.length; i++){
            for(int j = i + 1; j < realarray.length; i++){
                if(realarray[i] > realarray[j]){
                    int temp = realarray[i];
                    realarray[i] = realarray[j];
                    realarray[j] = temp;
                }
            }
        }
        System.out.println("생성 번호 : ");
        for(int i = 0; i < realarray.length; i++)
            System.out.print(realarray[i] + " ");

    }
}
