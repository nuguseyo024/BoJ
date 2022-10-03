package ch4_Loop;

public class Exercise4_9 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		int num1 = num%10; 
		int num2 = (num%100 - num%10) / 10;
		int num3 = (num%1000 - num%100) /100;
		int num4 = (num%10000 - num%1000) /1000;
		int num5 = num /10000;
		
		System.out.println(num5);
		System.out.println(num1+num2+num3+num4+num5);
		// num%10 = 5
		// num%100 = 45
		// num%1000 = 345
		// num%10000 = 2345
	}

}