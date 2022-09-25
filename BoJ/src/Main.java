import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		int score = 0;
		int sum[] = new int[n];
		
		char x;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			for(int j = 0; j < str.length(); j++) {			
				x = str.charAt(j);
				String xstr = String.valueOf(x);
				
				if(xstr.equals("O")) {
					score++;
					sum[i] += score;
				}else if(xstr.equals("X")) {
					score = 0;
				}
				
			}
			score = 0;
		}
		for(int i = 0; i < n; i++) {
			bw.write(Integer.toString(sum[i]));
			bw.write("\n");
		}
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
