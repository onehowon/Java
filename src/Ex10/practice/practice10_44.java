import java.util.*;
import java.text.*;

public class practice10_44{
    public static void main(String[] args){
        
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        
        date1.set(2001, 1, 21);
        
        SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
        
        System.out.println("Birthday : " + d.format(new Date(date1.getTimeInMillis())));
        System.out.println("Today : " + d.format(new Date(date2.getTimeInMillis())));
        
        long difference = (date2.getTimeInMillis()) - (date1.getTimeInMillis()) / 1000;
        System.out.println(difference / (24*60*60) + "days");
    }
}