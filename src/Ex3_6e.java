
public class Ex3_6e {

	public static void main(String[] args) {
		
		int fahrenheit = 100;
		float celcius = ((5 / 9.0F) * (fahrenheit - 32));
		
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:" + String.format("%.2f",celcius));

	}

}
