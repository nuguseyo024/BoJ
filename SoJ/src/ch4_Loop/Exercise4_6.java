package ch4_Loop;

public class Exercise4_6 {

	public static void main(String[] args) {

		for(int i = 0; i< 6; i++) {
			for(int j = 0; j<6; j++) {
				if(i+j == 6) {
					System.out.printf("%d + %d = %d%n",i,j,i+j);
				}
			}
		}
	}

}