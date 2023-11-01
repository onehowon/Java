public class practice8_4{
    static void method(boolean b){
        try{
            System.out.println(1);
            if(b) throw new ArithmeticException();
            System.out.println(2);
        } catch (RuntimeException r){
            System.out.println(3);
            return;
        } catch( Exception e ){
            System.out.println(4);
            return;
        } finally{
            System.out.println(5);
        }
        System.out.println(6);
    }
    public static void main(String[] args){
        method(true);
        method(false);
    }
}

// true인 경우 ArithmeticException이 RuntimeException의 자손이므로, RuntimeException이 정의된 catch 블럭에서 예외처리된 후 return문을 만나 메서드가 종료되면서 finally 블럭을 출력 