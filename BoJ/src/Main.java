import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main
{

    public static void main(String[] params) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        bw.write(Integer.toString(fib(n)));

        bw.flush();
        bw.close();
        br.close();
    }

    static int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fib(n-1)+fib(n-2);
    }

}