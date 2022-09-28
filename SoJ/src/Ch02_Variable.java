
public class Ch02_Variable {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		int z = 3;
		
		int tmp = 0;
		
		tmp = x;
		x = y;
		y = z;
		z = tmp;
		 
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
}
