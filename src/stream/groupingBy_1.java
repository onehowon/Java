package stream;


import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

class Student3{
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    Student3(String name, boolean isMale, int hak, int ban, int score){
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    String getName(){return name;}
    boolean isMale(){return isMale;}
    int getHak(){return hak;}
    int getBan(){return ban;}
    int getScore(){return score;}

    public String toString(){
        return String.format("[%s, %s, %d학년 %d반, %3d점]",
        name, isMale ? "남":"여", hak, ban, score);
    }

    enum Level{
        HIGH, MID, LOW
    }
}
public class groupingBy_1 {
    public static void main(String[] args) {
        Student3[] stuArr={
                new Student3("나자바", true, 1, 1, 300),
                new Student3("김자바", true, 2, 2, 200),
                new Student3("박자바", false, 3, 2, 400),
                new Student3("진자바", true, 4, 4, 300),
                new Student3("구자바", false, 5, 5, 200),
        };

        System.out.printf("1. 단순그룹화(반별로 그룹화)%n");
        Map<Integer, List<Student3>> stuByBan = Stream.of(stuArr)
                .collect(groupingBy(Student3::getBan));

        for(List<Student3> ban : stuByBan.values()){
            for(Student3 s: ban){
                System.out.println(s);
            }
        }

        System.out.printf("%n2 단순그룹화(성적별로 그룹화)%n");
        Map<Student3.Level, List<Student3>> stuByLevel = Stream.of(stuArr)
                .collect(groupingBy(s ->{
                    if(s.getScore() >= 200) return Student3.Level.HIGH;
                    else if(s.getScore() >= 100) return Student3.Level.MID;
                    else return Student3.Level.LOW;
                }));

        TreeSet<Student3.Level> keySet = new TreeSet<>(stuByLevel.keySet());

        for(Student3.Level key : keySet){
            System.out.println("["+key+"]");

            for(Student3 s:stuByLevel.get(key))
                System.out.println(s);
            System.out.println();
            }

        System.out.printf("%n3. 단순그룹화 + 통계(성적별 학생수)%n");
        Map<Student3.Level, Long> stuCntByLevel = Stream.of(stuArr)
                .collect(groupingBy(s->{
                    if(s.getScore() >= 200) return Student3.Level.HIGH;
                    else if(s.getScore() >= 100) return Student3.Level.MID;
                    else return Student3.Level.LOW;
                }, counting()));

        for(Student3.Level key : stuCntByLevel.keySet())
            System.out.printf("[%s] - %d명, ", key, stuCntByLevel.get(key));
        System.out.println();
        }
    }

