class Ex6_4{
    public static void main(String[] args){
        Mymath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long reuslt3 = mm.multiply(5L, 3L);
        long reuslt4 = mm.divide(5L, 3L);
        
        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divde(5L, 3L) = " + result4);
    }
}

class MyMath{
    long add(long a, long b){
        long result = a + b;
        return result;
    }
    long subtract(long a, long b){return a - b; }
    long multiply(long a, long b){return a * b; }
    double divide(double a, double b){return a / b;}
}