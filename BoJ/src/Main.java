import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		final int N = 42;
		int[] arr = new int[10];
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			set.add(arr[i] % N);
			
		}
		
		bw.write(Integer.toString(set.size()));
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
