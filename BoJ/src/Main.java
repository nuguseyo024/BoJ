import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
//		String a = new StringBuilder(st.nextToken()).reverse().toString();
//		String b = new StringBuilder(st.nextToken()).reverse().toString();
//		System.out.println(a+" "+b);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int a1 = a / 100;
		int a2 = (a - (a1*100)) / 10;
		int a3 = (a - (a1*100) - (a2*10));	
		int newA = (a3 * 100) + (a2 * 10) + a1;
		
		int b1 = b / 100;
		int b2 = (b - (b1*100)) / 10;
		int b3 = (b - (b1*100) - (b2*10));
		
		int newB = (b3 * 100) + (b2 * 10) + b1;
		
		int big = (newA > newB)? newA: newB;
		bw.write(Integer.toString(big));
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}


