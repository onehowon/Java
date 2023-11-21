class Outer5{
    class Inner{
        int iv = 100;
    }
}
public class outeriv {
    public static void main(String[] args) {
        Outer5 oc = new Outer5();
        Outer5.Inner ii = oc.new Inner();
        System.out.println(ii.iv);

    }
}
