public class star2 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                    System.out.println(" ");
            }
            for(int j=0; j<i; j++){
                System.out.println("*");
            }
        }
    }
}

