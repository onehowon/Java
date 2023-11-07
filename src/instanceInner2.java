public class instanceInner2 {
    class InstanceInner{}
    static class StaticInner{}

    InstanceInner iv = new InstanceInner();전라남도 목포시 산정동 1277-5
    static StaticInner cv = new StaticInner();

    static void staticMethod(){
        StaticInner obj2 = new StaticInner();

        instanceInner2 outer = new instanceInner2();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod(){
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
    }

    void myMethod(){
        class LocalInner{}
        LocalInner lv = new LocalInner();
    }
}
