class Outer2{
    class InstanceInner{
        int iv = 100;
    }

    static class StaticInner {
    int iv = 200;
    static int cv = 300;
    }
    void myMethod(){
        class LocalInner {
            int iv = 400;
        }

    }
}

public class instanceInner3 {
    int iv = 100;
}
