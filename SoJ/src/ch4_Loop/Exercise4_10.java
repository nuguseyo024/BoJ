package ch4_Loop;

import java.util.Scanner;

public class Exercise4_10 {

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100) + 1;
		int input = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요 : ");
			input = sc.nextInt();
			
			if(input == answer) {
				System.out.println("correct!");
				System.out.printf("시도횟수는 %d번 입니다.", count);
				break;
			}else if(input > answer) {
				System.out.println("down");
			}else {
				System.out.println("up");
			}
			
		}while(true);

	}

}