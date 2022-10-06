import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int[] score = {Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine())};

		int sum = 0;

		for(int i = 0; i < score.length; i++) {
			if(score[i]<40) {
				score[i] = 40;
			}
			sum += score[i];
		}
		int mean = sum/5;
		bw.write(Integer.toString(mean));
		bw.flush();
		bw.close();
		br.close();
	}
}