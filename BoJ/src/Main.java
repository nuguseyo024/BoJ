import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());		
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int time = Integer.parseInt(st.nextToken());
		
		int mintime = min + time;
		if(mintime >= 60) {
			hour = hour + (mintime/60);

			min = mintime - ((mintime/60)*60);
			if(hour >= 24) {
				hour = hour - 24;
			}
		}else if(mintime < 60) {
			min = mintime;
		}

		bw.write(hour+" "+min);
			
		bw.flush();
		bw.close();
		br.close();
		
	}

}
