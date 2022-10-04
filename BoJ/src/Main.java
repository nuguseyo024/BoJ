import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception {
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		int res = Integer.parseInt(a) * Integer.parseInt(b) * Integer.parseInt(c);
        String str = Integer.toString(res);
        char[] ch = new char[str.length()];
        int[] num = new int[10];
        
		for(int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if(ch[i] == 48) {
				num[0]++;
			}else if(ch[i] == 49) {
				num[1]++;
			}else if(ch[i] == 50) {
				num[2]++;
			}else if(ch[i] == 51) {
				num[3]++;
			}else if(ch[i] == 52) {
				num[4]++;
			}else if(ch[i] == 53) {
				num[5]++;
			}else if(ch[i] == 54) {
				num[6]++;
			}else if(ch[i] == 55) {
				num[7]++;
			}else if(ch[i] == 56) {
				num[8]++;
			}else if(ch[i] == 57) {
				num[9]++;
			}
			
		}
		
		for(int i = 0; i < num.length; i++) {
			bw.write(num[i]+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}