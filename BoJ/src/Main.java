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
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int res = 0;

		if(a >= b) {
			if(a >= c) {
				if(b >= c) {
					res = b;
				}else if( c >= b) {
					res = c;
				}
			}else if( c >= a) {
				res = a;
			}
		}else if(b >= a) {
			if(b >= c) {
				if(c >= a) {
					res = c;
				}else if(a >= c) {
					res = a;
				}
			}else if(c >= b) {
				res = b;
			}
		}

 
		bw.write(Integer.toString(res));
		bw.flush();
		bw.close();
		br.close();
	}
}