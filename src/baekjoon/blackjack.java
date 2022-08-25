import java.util.Scanner;

public class blackjack{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int M = in.nextInt();
        
        int[] arr = new int[N];
        
        for(int i =0l i < N; i++){
            arr[i] = in.nextInt();
        }
        int result = search(arr, N, M);
        System.out.println(result);
    }
}
