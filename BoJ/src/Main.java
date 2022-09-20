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
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int max = 0;
		int min = 0;
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < arr.length ; i++) {					
			arr[i] = Integer.parseInt(st.nextToken());		
		}
		Arrays.sort(arr);
		min = arr[0];
		max = arr[n-1];
		
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
		br.close();
		
	}

}
