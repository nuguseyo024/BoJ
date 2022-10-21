package ch5_Array;

public class Ex5_5 {

	public static void main(String[] args){

		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
			// 배열의 각 요소에 1~45 값 저장
		}
		int tmp = 0; 	// 두 값을 바꾸는데 사용할 임시변수
		int j = 0; 		// 임의의 값을 얻어서 저장할 변수

		for (int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45);  // 0~44 범위의 임의의 값을 얻는다.
			// ball[i]와 ball[j]의 값을 서로 바꾼다.
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
	}
}
