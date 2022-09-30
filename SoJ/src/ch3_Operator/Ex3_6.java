package ch3_Operator;

public class Ex3_6 {

	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)((5/9f * (fahrenheit - 32)) * 100+ 1)  / 100f;
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}

}
