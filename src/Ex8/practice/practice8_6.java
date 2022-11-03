public class practice8_6{
    static void method(boolean b){
        try{
            System.out.println(1);
            if(b) System.exit(0);
            System.out.println(2);
        } catch(RuntimeException r){
            System.out.println(3);
            return;
        } catch(Exception e){
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

// System.exit(0);이 수행되면 프로그램이 즉시 종료됩니다.