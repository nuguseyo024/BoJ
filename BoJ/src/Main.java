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
		
		int testcase = Integer.parseInt(st.nextToken());
		for(int i = 0 ; i < testcase; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());
			String str = st.nextToken();
			String[] arr = new String[str.length()];
			
			for(int j = 0; j < str.length(); j++) {
				arr[j] = str.substring(j,j+1);
				
				for(int k = 0; k < n; k++) {
					
					System.out.print(arr[j]);
				}
			}
			System.out.println();			
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}


