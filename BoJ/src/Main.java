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
		
		int dice1 = Integer.parseInt(st.nextToken());
		int dice2 = Integer.parseInt(st.nextToken());
		int dice3 = Integer.parseInt(st.nextToken());

		int price = 0;
		int max = 0; 
		
		// 모두 다른 눈이 나오는 경우 
		if(dice1!=dice2 && dice2!=dice3) {
			max = dice1 > dice2 ? (dice1 > dice3? dice1 : dice3) : (dice2 > dice3 ? dice2 : dice3);
			price = (max * 100);			
		}
		
		if(dice1 == dice2 && dice2 == dice3) {
			price = (10000+(dice2*1000));
		} else if(dice1==dice2 || dice1 == dice3 || dice2 == dice3) {
			if(dice1==dice2) {
				price = 1000 + (dice1 * 100);
			}
			if(dice1==dice3) {
				price = 1000 + (dice1 * 100);
			}
			if(dice3==dice2) {
				price = 1000 + (dice3 * 100);
			}
		} 

		bw.write(Integer.toString(price));
		bw.flush();
		bw.close();
		br.close();
		
	}

}
