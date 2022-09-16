import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		// 1 1 2 2 2 8
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] arr = new int[6];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());			
		}
		
		int x = 0;
		arr[0] = ((-1)*arr[0]) + 1;	
		arr[1] = ((-1)*arr[1]) + 1;	
		arr[2] = ((-1)*arr[2]) + 2;	
		arr[3] = ((-1)*arr[3]) + 2;	
		arr[4] = ((-1)*arr[4]) + 2;	
		arr[5] = ((-1)*arr[5]) + 8;	

		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i]+" ");
		}
		bw.flush();
		bw.close();
		br.close();

	}

}
