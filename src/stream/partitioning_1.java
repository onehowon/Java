package stream;


import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.partitioningBy;

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

    String getName(){ return name; }
    boolean isMale(){ return isMale; }
    int getHak(){return hak;}
    int getBan(){return ban;}
    int getScore(){return score;}

    public String toString(){
        return String.format("[%s, %s, %d학년, %d반, %3d점]",
                name, isMale ? "남":"여", hak, ban, score);
    }
    enum level{HIGH, MID, LOW}
}

public class partitioning_1 {
    public static void main(String[] args) {
        Student2[] stuArr = {
                new Student2("나자바", true, 1, 1, 300),
                new Student2("김자바", true, 2, 2, 200),
                new Student2("박자바", false, 3, 2, 400),
                new Student2("진자바", true, 4, 4, 300),
                new Student2("구자바", false, 5, 5, 200),
        };

        System.out.printf("1. 단순분할(성별)%n");
        Map<Boolean, List<Student2>> stuBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student2::isMale));

        List<Student2> maleStudent = stuBySex.get(true);
        List<Student2> femaleStudent = stuBySex.get(false);

        for(Student2 s : maleStudent) System.out.println(s);
        for(Student2 s : femaleStudent) System.out.println(s);

        System.out.printf("%n2. 단순분할 + 통계(성별 학생 수)%n");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student2::isMale, counting()));

        System.out.println("남학생 수:" + stuNumBySex.get(true));
        System.out.println("여학생 수:" + stuNumBySex.get(false));
    }
}
