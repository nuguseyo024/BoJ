import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				bw.write(" ");
			}
			for(int j = n; j > i; j--) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}