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
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine()," ");
		int num = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int[] arr = new int[num];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());	
			if(arr[i] < x) {
				bw.write(arr[i]+" ");
			}
			
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
