import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int testcase = Integer.parseInt(st.nextToken());

		for(int i = 0; i < testcase; i ++) {
			st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());
			
			int arr[] = new int[n];
			
			double sum = 0; 
			double mean = 0;
			
			for(int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			//System.out.println("sum:"+sum);
			mean = (sum/n);
			//System.out.println("mean:"+mean);
			double count = 0;
			for(int j = 0; j < n; j++) {
				if(arr[j] > mean) {
					
					count++;
				}	
			}
			//System.out.println("count:"+count);
			System.out.printf("%.3f%%",(count/n)*100);
			System.out.println();
		}

		br.close();
		
	}

}
