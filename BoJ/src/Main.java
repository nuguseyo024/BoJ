import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = st.nextToken();
		String[] arr = new String[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.substring(i, i+1);		
		}
		int a = Arrays.asList(arr).indexOf("a");
		int b = Arrays.asList(arr).indexOf("b");
		int c = Arrays.asList(arr).indexOf("c");
		int d = Arrays.asList(arr).indexOf("d");
		int e = Arrays.asList(arr).indexOf("e");
		int f = Arrays.asList(arr).indexOf("f");
		int g = Arrays.asList(arr).indexOf("g");
		int h = Arrays.asList(arr).indexOf("h");
		int i = Arrays.asList(arr).indexOf("i");
		int j = Arrays.asList(arr).indexOf("j");
		int k = Arrays.asList(arr).indexOf("k");
		int l = Arrays.asList(arr).indexOf("l");
		int m = Arrays.asList(arr).indexOf("m");
		int n = Arrays.asList(arr).indexOf("n");
		int o = Arrays.asList(arr).indexOf("o");
		int p = Arrays.asList(arr).indexOf("p");
		int q = Arrays.asList(arr).indexOf("q");
		int r = Arrays.asList(arr).indexOf("r");
		int s = Arrays.asList(arr).indexOf("s");
		int t = Arrays.asList(arr).indexOf("t");
		int u = Arrays.asList(arr).indexOf("u");
		int v = Arrays.asList(arr).indexOf("v");
		int w = Arrays.asList(arr).indexOf("w");
		int x = Arrays.asList(arr).indexOf("x");
		int y = Arrays.asList(arr).indexOf("y");
		int z = Arrays.asList(arr).indexOf("z");

		bw.write(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+o+" "+p+" "+
		q+" "+r+" "+s+" "+t+" "+u+" "+v+" "+w+" "+x+" "+y+" "+z);
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}


