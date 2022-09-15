package ex03.loop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int copy = n;
		int count = 0;

		while(true) {
			count++;
			n = ((n%10)*10) + (((n/10) + (n%10))% 10);
			
			if(copy == n) {
				break;
			}
		}
		System.out.println(count);
		
	}
}
