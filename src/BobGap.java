public class BobGap {
    public static void main(String[] args) {
        int donPrice = 8000;
        int kalPrice = 10000;
        int kingPrice = 5000;

        int donNumber = 16;
        int kalNumber = 8;
        int kingNumber = 1;

        System.out.printf("%s x %2d = %6d\n", "돈가스", donNumber, donPrice * donNumber);
        System.out.printf("%s x %2d = %6d\n", "칼국수", kalNumber, kalPrice * kalNumber);
        System.out.printf("%s x %2d = %6d\n", "왕만두", kingNumber, kingPrice * kingNumber);
        int sum = donPrice * donNumber + kalPrice * kalNumber + kingPrice * kingNumber;
        System.out.printf("%s: %d\n", "총합", sum);
    }
}
