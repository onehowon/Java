import java.util.*;
import java.text.*;

public class practice10_22{
    public static void main(String[] args){
        String pattern = "yyyy/MM/dd";
        String pattern2 = "입력하신 날짜는 E요일입니다.";
        
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        SimpleDateFormat df1 = new SimpleDateFormat(pattern2);
        Scanner s = new Scanner(System.in);
        
        Date d = null;
        
        do{
            System.out.println("날짜를" + pattern + "의 형태로 입력해주세요(입력예:2017/05/11)");
            
            try{
                System.out.println(">> ");
                d = df.parse(s.nextLine());
                break;
            } catch(Exception e){}
        } while (true);
        System.out.println(df1.format(d));
    }
}