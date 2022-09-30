import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		
		int count = 0;
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			if(check() == true) {
				count++;
			}
		}
		System.out.println(count);
		
		br.close();
		
	}
	
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for(int i = 0; i< str.length(); i++) {
			int now = str.charAt(i);
			// i번째 문자 저장 (현재 문자) 
			
			if(prev != now) {	// 앞선 문자와 i번째 문자가 같지 않다면?
				if(check[now-'a'] == false) {  // 해당 문자가  처음 나오는 경우(false인 경우) 
					check[now-'a'] = true;		// true로 바꿔준다.
					prev = now;					// 다은 턴을 위해 prev도 바꿔준다. 
					
				}
				else { // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어 x)
					return false; // 함수 종료 
				}
			}
			
			// 앞선 문자와 i번째 문자가 같다면? (연속된 문자)
			else {		// else문 생략 가능 
				continue;
			}	
		}
		return true;
		
	}
}


