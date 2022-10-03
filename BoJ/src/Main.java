import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(),",");
			int res = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			bw.write(Integer.toString(res)+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}


