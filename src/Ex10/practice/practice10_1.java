import java.util.*;
import java.text.*;

public class practice10_1{
    public static void main(String[] args){
        
        Calendar date = Calendar.getInstance();
        
        for(int i=0; i<12; i++){
            date.set(Calendar.YEAR, 2021);
            date.set(Calendar.MONTH, i);
            
            for(int j=1; j<date.getActualMaximum(Calendar.DATE); j++){
                date.set(Calendar.DATE, j);
                
                if(date.get(Calendar.DAY_OF_WEEK)==1 && date.get(Calendar.DAY_OF_WEEK_IN_MONTH)==2){
                    Date d = date.getTime();
                    System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
                }
            }
        }
    }
}