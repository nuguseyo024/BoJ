package ch4_Loop;

public class Exercise4_4 {

	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		
		while(sum < 100) {
			n++;
			if(n % 2 != 0) {
				sum += n;
			}else {				
				sum += (-1*n);
			}
			
		}
		System.out.println(n);
		
	}

}
