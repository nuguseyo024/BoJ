package ex03.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testcase = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 1; i <= testcase; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
            
			bw.write("Case #"+i+": ");
			bw.write(a+" + ");
			bw.write(b+" = ");
			bw.write(a+b+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
