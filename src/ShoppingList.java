public class ShoppingList {
    public static void main(String[] args) {

        String item1 = "한우 꽃등심";
        int price1 = 112500;

        String item2 = "참치 선물팩";
        int price2 = 25500;

        String item3 = "맥스봉 한팩";
        int price3 = 500;

        System.out.printf("품명: %-10s 가격: %8d\n", item1, price1);
        System.out.printf("품명: %-10s 가격: %8d\n", item2, price2);
        System.out.printf("품명: %-10s 가격: %8d\n", item3, price3);
    }
}
