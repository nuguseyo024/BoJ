
public class Fibonacci_numbers {
	
	// 문제 : 피보나치 수열의 10번째 항을 출력하는 코드를 작성하시오 
	public static void main(String[] args) {
		int a1 = 1;
		int a2 = 1;
		int sum = 0;
		
		for(int i = 1; i < 9; i++) {
			sum = a1 + a2;
			a1 = a2;
			a2 = sum;
			System.out.println(i+2+"번째 항 : "+sum);
		}

	}

}
