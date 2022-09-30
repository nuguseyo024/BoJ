package ch3_Operator;

public class Ex3_3 {

	public static void main(String[] args) {
		int num = 456;
		// num의 값 중 백의 자리 이하를 버리는 코드
		System.out.println(Math.round(num/100) * 100);
		System.out.println((num / 100) * 100);
		
	}

}
