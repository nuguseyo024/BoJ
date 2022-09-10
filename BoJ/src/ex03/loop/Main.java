package ex03.loop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int cnt = sc.nextInt();

		int arr[] = new int[cnt];
		int sum = 0;
		
		for(int i = 0; i < cnt; i++) {
			int goods = sc.nextInt();
			int count = sc.nextInt();
			
			arr[i] = goods * count ;
			sum += arr[i];
		}
		
		if(sum == total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}	
		
		sc.close();
	}

}
