import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[] args) throws Exception {
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		bw.write(Integer.toString(a+b));
		bw.flush();
		bw.close();
		br.close();
	}
}


