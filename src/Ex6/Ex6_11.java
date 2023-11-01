class Data_1{
    int value;
}

class Data_2{
    int value;
    
    Data_2(int x){ // 매개변수가 있는 생성자
        value = x;
    }
}

// 컴파일러가 자동적으로 기본 생성자를 추가해주는 경우는 클래스 내에 생성자가 하나도 없을 때 뿐이다.

public class Ex6_11{
    public static void main(String[] args){
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(); // compile error 발생
    }
}