class Outer6{
    static class Inner{
        int iv = 200;
    }
}
public class outeriv_2 {
    public static void main(String[] args) {
        Outer6 oc = new Outer6();
        Outer6.Inner ii = new Outer6.Inner();
        System.out.println(ii.iv);
    }
}