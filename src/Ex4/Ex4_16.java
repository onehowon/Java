package Ex4;

public class Ex4_16 {
	public static void main(Strings[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break;
			++i;
			sum += i;
			
		}
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
	}

}
