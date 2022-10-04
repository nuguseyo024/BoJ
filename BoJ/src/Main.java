import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());		
		int n = Integer.parseInt(st.nextToken());
        
		for(int i = n; i >= 1; i--) {
			bw.write(Integer.toString(i));
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}