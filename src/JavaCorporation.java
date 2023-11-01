public class JavaCorporation {

    public static void printPay(double basePay, int hours) {
        double lastPay = 15;
        if (basePay < 8) {
            System.out.println("최저시급 불이행");
        } else {
            if (hours >= 40 && hours <= 60) {
                lastPay = (basePay * 40) + (hours - 40) * basePay * 1.5;
            } else if (hours < 60) {
                System.out.println("근무시간 초과");
            } else {
                lastPay = basePay * hours;
            }
        }
        System.out.println("lastPay= " + lastPay);
    }

    public static void main(String[] args) {
        printPay(7.50, 35);
        printPay(8.20, 47);
        printPay(10.00, 73);

    }
}
