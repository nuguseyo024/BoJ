package ch4_Loop;

public class Exercise4_7 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int a = str.charAt(i) - 48;
			sum += a;
		}
		
		System.out.println("sum = "+ sum);
	}

}