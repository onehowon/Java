public class emptyString {
    public static void main(String[] args) {
        char[] cArr = new char[0];
        String s = new String(cArr);

        System.out.println("cArr.length="+cArr.length);
        System.out.println("@@@"+s+"@@@");
    }
}
