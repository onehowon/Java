class Outer7{
    int value = 10;

    class Inner{
        int value = 20;
        void method1(){
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer7.this.value);
        }
    }
}
public class methodOuter {
    public static void main(String[] args) {
        Outer7 outer = new Outer7();
        Outer.Inner inner = outer.new Inner();

        inner.method1();
    }

}
