public class object_1 {
    public static void main(String[] args) {
        Value2 v1 = new Value2(10);
        Value2 v2 = new Value2(10);

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else System.out.println("v1과 v2는 다릅니다.");
    }
}

class Value2{
    int value;

    Value2(int value){
        this.value = value;
    }
}
