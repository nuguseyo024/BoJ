package ch6_OOP1;

public class Ex6_3 {

	public static void main(String[] args) {
		// 클래스 변수 (static 변수)는 객체생성 없이 '클래스이름.클래스변수'로 직접 사용 가능
		System.out.println("Card.width = "+ Card.width);
		System.out.println("Card.height = "+ Card.height);

		Card c1 = new Card();
		c1.kind   = "Heart";
		c1.number = 7;

		// 인스턴스 변수의 값을 변경
		Card c2 = new Card();
		c2.kind   = "Spade";
		c2.number = 4;

		System.out.println("=====================================================");
		System.out.printf("c1은 %s, %d이며, 크기는 (%d, %d)%n",c1.kind,c1.number,c1.width,c1.height);
		System.out.printf("c2은 %s, %d이며, 크기는 (%d, %d)%n",c2.kind,c2.number,c2.width,c2.height);

		System.out.println("=====================================================");
		System.out.println("c1의 withd를 50, height를 80으로 변경합니다.");
		// 클래스 변수의 값을 변경
		c1.width  = 50;
		c1.height = 80;

		System.out.println("=====================================================");
		System.out.printf("c1은 %s, %d이며, 크기는 (%d, %d)%n",c1.kind,c1.number,c1.width,c1.height);
		System.out.printf("c2은 %s, %d이며, 크기는 (%d, %d)%n",c2.kind,c2.number,c2.width,c2.height);

	}
}


class Card {
	String kind;
	int number;
	static int width  = 100;
	static int height = 250;

}