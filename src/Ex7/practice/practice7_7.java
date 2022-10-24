class Outer{
    static class Inner{
        int iv = 200;
    }
}

public class practice7_7{
    public static void main(String[] args){
        Outer.Inner si = new Outer.Inner();
        System.out.println(si.iv);
        
    }
}