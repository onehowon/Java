public class practice8_8{
    public static void main(String[] args){
        try{
            method1();
            System.out.println(6);
        } catch(Exception e){
            System.out.println(7);
        }
    }
    
    static void method1() throws Exception{
        try{
            method2();
            System.out.println(1);
        } catch(NullPointerException e){
            System.out.println(2);
            throw e;
        } catch(Exception e){
            System.out.println(3);
            
        } finally{
            System.out.println(4);
        }
        System.out.println(5);
    }
    static void method2(){
        throw new NullPointerException();
    }
}

// method2( )에서 발생한 예외를 method1( )의

// try-catch문에서 처리했다가 다시 발생시켜

// main메서드에 예외를 전달합니다.