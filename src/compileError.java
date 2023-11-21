class Product_ex {
    int price;
    int bonusPoint;

    Product_ex(){}

    Product_ex(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tvtv extends Product_ex {
    Tvtv(){}

    public String toString(){
        return "Tv";
    }
}
public class compileError {
    public static void main(String[] args) {
        Tvtv t = new Tvtv();
    }
}
