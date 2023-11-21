public class ArraySum {
    public static int sum(int[] numbers) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        System.out.println(sum);
//        해당 메소드를 구현하세요
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i * i;
        }
        System.out.printf("총합: %d\n", sum(arr));
    }
}
