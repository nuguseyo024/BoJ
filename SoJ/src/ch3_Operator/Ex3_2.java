package ch3_Operator;

public class Ex3_2 {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		char c = 'A'; //65
		
		System.out.println(x >= 5 || x < 0 && x > 2); 	 // false
		System.out.println(y += 10 - x++);	// 12		y = 12
		System.out.println(x += 2);  	// 5 <<	!		x = 6
		System.out.println(!('A' <= c && c <= 'Z'));	// false
		System.out.println('C' - c); 	// 2
		System.out.println('5' - '0');  // 5
		System.out.println(c + 1); 		// 66
		System.out.println(++c); 		// 65 << ! 		// c = 'B'
		System.out.println(c++);		// 'B'			// c = 'C'
		System.out.println(c); 			// 'C'

	}

}
