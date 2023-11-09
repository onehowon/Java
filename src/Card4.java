
class Card3{
    String kind;
    int number;

    Card3(){
        this("SPADE", 1);
    }

    Card3(String kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public String toString(){
        return "kind: " + kind + ", number : " + number;
    }
}

public class Card4 {
    public static void main(String[] args) {
        Card3 c1 = new Card3();
        Card3 c2 = new Card3("HEART", 10);
        System.out.println(c1.toString());
    }
}