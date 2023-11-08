class Outer4{
    int value = 10;

    class Inner {
        int value = 20;

        void method1(){
            int value = 30;
            System.out.println("value:" + value);
            System.out.println("this.value:" + this.value);
            System.out.println("Outer4.this.value:" + Outer4.this.value);
        }
    }
}

public class inner4 {
    public static void main(String[] args) {
        Outer4 outer = new Outer4();
        Outer4.Inner inner = outer.new Inner();
        inner.method1();
    }
}
