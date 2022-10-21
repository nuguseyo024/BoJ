package ch5_Array;

public class Ex5_6 {

	public static void main(String[] args){

		String[] names = {"Jessi", "Sandra", "Alex"};
		for (int i = 0; i < names.length; i++) {
			System.out.println("names["+i+"] : "+names[i]);
		}
		String tmp = names[2]; // names 배열의 세번째 요소를 tmp에 저장
		System.out.println("tmp : "+tmp);
		names[0] = "Jamie"; // names 배열의 첫번째 요소를 "James"로 변경

		for (int i = 0; i < names.length; i++) {
			System.out.println("names["+i+"] : "+names[i]);
		}
	}
}
