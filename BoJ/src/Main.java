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
		
//		예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//		세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		float[] arr = new float[n];
		float max = 0;
		float[] newArr = new float[n];
		float sum = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(int i = 0; i < n; i++) {
			newArr[i] = (arr[i]/max)*100;
			sum += newArr[i];
		}
		
		System.out.println(sum/n);
		bw.flush();
		bw.close();
		br.close();
		
	}

}
