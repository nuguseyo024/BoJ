import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int[] burgers = new int[3];
		for(int i = 0; i < 3; i++) {
			burgers[i] = Integer.parseInt(br.readLine());
		}

		int[] drinks = new int[2];
		for(int i = 0; i < 2; i++) {
			drinks[i] = Integer.parseInt(br.readLine());
		}

		int[] sets = new int[6];


		sets[0] = burgers[0]+drinks[0] -50 ;
		sets[1] = burgers[0]+drinks[1] -50 ;
		sets[2] = burgers[1]+drinks[0] -50 ;
		sets[3] = burgers[1]+drinks[1] -50 ;
		sets[4] = burgers[2]+drinks[0] -50 ;
		sets[5] = burgers[2]+drinks[1] -50 ;

		Arrays.sort(sets);
		bw.write(Integer.toString(sets[0]));
		bw.flush();
		bw.close();
		br.close();
	}
}