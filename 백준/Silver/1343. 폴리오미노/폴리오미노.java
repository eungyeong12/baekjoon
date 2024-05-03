import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.replace("XXXX", "AAAA");
        s = s.replace("XX", "BB");
        if(s.contains("X"))
            System.out.println(-1);
        else
            System.out.println(s);
    }
}