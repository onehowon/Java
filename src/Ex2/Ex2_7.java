
public class Ex2_7 {
	public static void main(String args[]) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" "+ 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7); // 덧셈 연산자는 오른쪽의 방향으로 연산을 수행하기에 결합순서에 따라 결과가 달라짐
	}

}
