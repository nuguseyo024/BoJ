package ch4_Loop;

public class Exercise4_2 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i < 21; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			else {
				sum += i;
				
			}
			System.out.printf("i : %d, sum : %d%n",i,sum);
		}
		System.out.println(sum);
	}

}
