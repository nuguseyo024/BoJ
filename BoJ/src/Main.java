import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i <= n; i++) { // 0 1 2 3 4
			for(int j = n-1; j >= i; j-- ) { // 4 3 2 1 0
				System.out.print(" ");
			}
			for(int j = 0; j < i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		bw.flush();
		bw.close();
		br.close();
	}
}