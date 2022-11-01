package ch6_OOP1;

public class Ex6_4 {

	public static void main(String[] args) {

		MyMath mm = new MyMath();
		long result1 =   mm.add(5L,3L);
		long result2 =   mm.subtract(5L,3L);
		long result3 =   mm.multiply(5L,3L);
		double result4 = mm.divide(5L,3L);	// double대신 long 값으로 호출. double로 자동형변환됨

		System.out.printf("add : %d%n", result1);
		System.out.printf("subtract : %d%n", result2);
		System.out.printf("multiply : %d%n", result3);
		System.out.printf("divide : %f%n", result4);
	}
}


class MyMath {
	long add(long a, long b) 	      {	return a + b; }
	long subtract(long a, long b)	  {	return a - b; }
	long multiply(long a, long b) 	  {	return a * b; }
	double divide(double a, double b) {	return a / b; }
}
