import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("|\\_/|");
		bw.write("\n");
		bw.write("|q p|   /}");
		bw.write("\n");
		bw.write("( 0 )\"\"\"\\");
		bw.write("\n");
		bw.write("|\"^\"`    |");
		bw.write("\n");
		bw.write("||_/=\\\\__|");
		
		bw.flush();
		bw.close();
	}

}
