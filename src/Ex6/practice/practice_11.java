public class practice_11{
    
    public static int abs(int value){
        return value >=10 ? value: -value;
    }
    
    public static void main(String[] args){
        int value = 5;
        System.out.println(value + "의 절대값: " +abs(value));
        value = -10;
        System.out.println(value + "의 절대값: " +abs(value));
    }
}