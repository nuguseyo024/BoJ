import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		int res = 1;
		
		for(int i = n; i > 1; i--) {
			res *= i;
		}
		
		bw.write(Integer.toString(res));
		bw.flush();
		bw.close();
		br.close();
	}
}