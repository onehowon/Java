import java.util.function.*;

public class Ex14_3{
    public static void main(String[] args){
        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i > 200;
        Predicate<Integer> r = i -> i%2 == 0;
        Predicate<Integer> notP = p.negate(); // P에 대한 부정
        
        Predicate<Integer> all = notP.and(q.or(r)); // Predicate로 조건식을 여러개 묶음, p 값인 i < 100이 아니여야 하며, i는 짝수인 200이 넘지 않는 값이여야 함.
        System.out.println(all.test(150)); // 150은 두 조건에 모두 부합하므로 true
        
        String str1 = "abc";
        String str2 = "abc";
        
        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2); // 문자열 두개 모두 abc로 equal에 대한 결과 부합, true
        System.out.println(result);
    }
}