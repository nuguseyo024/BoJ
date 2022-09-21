import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int n = 0;
		int[] arr = new int[9];
		
		int max = 0;
		int max_idx = 0;
		
		for(int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			arr[i] = n;
			
			if(arr[i] > max) {
				max = arr[i];
				max_idx = i+1;
			}
		}
		bw.write(max+"\n"+max_idx);
		

		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
