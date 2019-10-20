import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String X = st.nextToken();
        String Y = st.nextToken();
        br.close();

        int revX = Integer.parseInt(rev(X));
        int revY = Integer.parseInt(rev(Y));
        int result = Integer.parseInt(rev(Integer.toString(revX + revY)));

        System.out.println(result);

    }

    static String rev(String a) {
        return (new StringBuffer(a)).reverse().toString();
    }
}
