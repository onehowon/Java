import java.util.*;
import java.text.*;

public class practice10_2{
    public static void main(String[] args){
        String pattern = "yyyy/MM/dd";
        String pattern2 = "입력하신 날짜는 E요일입니다.";
        
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        SimpleDateFormat df2 = new SimpleDateFormat(pattern2);
        Scanner s = new Scanner(System.in);
        
        Date d = null;
        
        do{
            System.out.println("날짜를" + pattern + "의 형태로 입력하세요");
            try{
                System.out.print(">> ");
                d = df.parse(s.nextLine());
                break;
            } catch(Exception e){}
        } while(true);
        System.out.println(df2.format(d));
    }
}