import java.io.*;
import java.util.StringTokenizer;

public class Baek5218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        for (int i = num; i > 0; i--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String x = st.nextToken();
            String y = st.nextToken();
            bw.write("Distances: ");
            for (int j = 0; j < x.length(); j++) {
                int x1 = x.charAt(j) - 'A' + 1;
                int y1 = y.charAt(j) - 'A' + 1;
                if (y1 >= x1) {
                    bw.write((y1 - x1) + " ");
                } else {
                    bw.write(y1 + 26 - x1 + " ");
                }
            }
            bw.write("\n");
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
