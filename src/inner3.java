class Outer3 {
    class InstnaceInner{ // 외부 클래스 private도 접근 가능
        int iv = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void myMethod(){
        class LocalInner{
            int iv = 400;
        }
    }
}

public class inner3 {

    public static void main(String[] args) {
        Outer3 oc = new Outer3();
        Outer3.InstnaceInner ii = oc.new InstnaceInner();

        System.out.println("ii.iv : " + ii.iv);
        System.out.println("Outer2.StaticInner.cv : " + Outer3.StaticInner.cv);

        Outer3.StaticInner si = new Outer3.StaticInner();
        System.out.println("si.iv : " + si.iv);
    }
}


