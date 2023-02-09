import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

class Student2{
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;
    
    Student2(String name, boolean isMale, int hak, int ban, int score){
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }
    
    String getName()    {return name;}
    boolean isMale()    {return isMale;}
    int hak()    {return hak;}
    int ban()    {return ban;}
    int score()    {return score;}
    
    public String toString(){
        return String.format("[%s,%s, %d학년 %d반, %3d점]",
                             name, isMale ? "남":"여", hak, ban, score);
        
    }
    
    enum Level {HIGH, MID, LOW}
}

public class Ex14_10{
    public static void main(String[] args){
        Student2[] strArr={
            new Student2("김자바", true, 1,1,300),
            new Student2("박자바", false, 1,1, 250),
            new Student2("윤자바", false, 1,2, 300),
            new Student2("백자바", true, 1,3, 200),
            new Student2("임자바", true, 2,1,350),
            new Student2("안자바", false, 2,2, 240),
            new Student2("황자바", true, 2,3, 200)
            
        };
        
    
        System.out.printf("1. 단순분할(성별로 분할)%n");
        Map<Boolean, List<Student2>> stuBySex = Stream.of(strArr)
            .collect(partitioningBy(Student2::isMale));
    
        List<Student2> maleStudent = stuBySex.get(true);
        List<STudent2> femaleStudent = stuBySex.get(false);
    
        for(Student2 s : maleStudent) System.out.println(s);
        for(Student2 s : femaleStudente) System.out.println(s);
    
        System.out.printf("%n2. 단순분할 + 통계(성별 학생 수)%n");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
            .collect(partitioningBy(Student2::isMale, counting()));
        
        System.out.println("남학생 수:" +stuNumBySex.get(true));
        System.out.println("여학생 수:" +stuNumBySex.get(false));
        
        System.out.printf("%n3. 단순분할 + 통계(성별 1등)%n");
        Map<Boolean, Optional<Student2>> topScoreBySex = Stream.of(strArr)
            .collect(partitioningBy(Student2::isMale,
                                   maxBy(comparingInt(Student2::getScore))
                                   ));
        
        System.out.println("남학생 1등 :"+topScoreBySex.get(true));
        System.out.println("여학생 1등 :"+topScoreBySex.get(false));
        
        Map<Boolean, Student2> topScoreBySex2 = Stream.of(strArr)
            .collect(partitioningBy(Student2::isMale,
                                   collectingAndThen(
                                   maxBy(comparingInt(Student2::getScore)), Optinal::get
                                   )
                                   ));
        
        System.out.println("남학생 1등:" + topScoreBySex2.get(true));
        System.out.println("여학생 1등:" + topScoreBySex2.get(false));
        
        System.out.printf("%n4. 다중분할(성별 불합격자, 100점 이하)%n");
        
        Map<Boolean, Map<Boolean, List<Student2>>> failedStuBySex=
            Stream.of(stuArr).collect(partitioningBy(Student2::isMale,
                                                    partitioningBy(s ->s.getScore() <=100))
                                     );
        
        List<Student2> failedMaleStu = failedStuBySex.get(true).get(true);
        List<Student2> failedFemaleStu = failedStuBySex.get(false).get(false);
        
        for(Student2 s : failedMaleStu) System.out.println(s);
        for(Student2 s : failedFemaleStu) System.out.println(s);
    }
}