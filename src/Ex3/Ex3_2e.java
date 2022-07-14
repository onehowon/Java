
public class Ex3_2e {
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeofBucket = 10;
		int numofBucket = (numOfApples /= sizeofBucket + 1);
		
		System.out.println("필요한 바구니의 수 :" +numofBucket);
	}

}
