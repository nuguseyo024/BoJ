package ch4_Loop;

import java.util.Scanner;

public class Ex4_14 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100 )+1;
		do {
			System.out.print("1과 100 사이의 정수를 입력하세요 >> ");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("down");
			}else if(input < answer) {
				System.out.println("up");
			}		
		}while(input != answer);
		
		System.out.println("correct!");
	}

}
