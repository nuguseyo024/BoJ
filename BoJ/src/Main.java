import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int num = Character.getNumericValue(ch);
			sum += num;
		}
		bw.write(Integer.toString(sum));
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}


