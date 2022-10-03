import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		double res = (double)Integer.parseInt(st.nextToken()) / Integer.parseInt(st.nextToken());
		
		bw.write(Double.toString(res));
		bw.flush();
		bw.close();
		br.close();
	}
}


