import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main
{

    public static void main(String[] params) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++)
        {
            int x = Integer.parseInt(br.readLine());
            set.add(x);
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            bw.write(Integer.toString(list.get(i))+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}