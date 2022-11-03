public class practice8_5{
    public static void main(String[] args){
        try{
            method1();
            
        } catch (Exception e){
            System.out.println(5);
        }
    }
    
    static void method1(){
        try{
            method2();
            System.out.println(1);
            
        } catch (ArithmeticException e){
            System.out.println(2);
        } finally{
            System.out.println(3);
        }
        
        System.out.println(4);
    }
    
    static void method2(){
        throw new NullPointerException();
    }
}

// main → method1→ method2 순서로 호출되며,

// method2에서 발생된 오류가 method1에서는 예외처리될

// catch블럭이 없으므로, finally문을 출력한 뒤, main메서드의

// Exception이 정의된 catch블럭에서 예외처리됩니다. 