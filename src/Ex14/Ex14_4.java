import java.util.*;

public class Ex14_4{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++)
            list.add(i); // 0부터 9까지
        
        list.forEach(i->System.out.print(i+","));
        System.out.println(); // i의 모든 요소 출력
        
        list.removeIf(x -> x%2==0 || x%3==0);
        System.out.println(); // list에서 2 또는 3의 배수를 제거
        
        list.replaceAll(i->i*10);
        System.out.println(); // i의 10을 곱한 값으로 모두 대체
        
        Map<String, String> map = new HashMap<>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");
        
        map.forEach((k,v)->System.out.print("{"+k+","+v+"},"));
        System.out.println(); // map의 모든 요소를 k,v 형식으로 출력
    }
}