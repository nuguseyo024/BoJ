package ex03.loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		for(int i = num-1; i >= 0; i--) {
			for(int k = 1; k <= i; k++) {
				bw.write(" ");
				//System.out.print(" ");
			}
			for(int j = 1; j<=num-i; j++) {
				bw.write("*");
				//System.out.print("*");
			}
			bw.write("\n");
			//System.out.println();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
