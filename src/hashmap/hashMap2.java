package hashmap;

import java.util.*;

public class hashMap2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 90);
        map.put("유자바", 80);
        map.put("한자바", 70);

        Set set = map.entrySet();
        Iterator it = set.iterator();


        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름 : " + e.getKey() + ", 점수: " + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 :  " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()){
            int i = (int)it.next();
            total += i;
        }

        System.out.println("총점:" + total);
    }
}
