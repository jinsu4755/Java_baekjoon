package step8;

import java.io.*;
import java.util.StringTokenizer;

public class Baek1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        br.close();
        int result = 0;

        if ((C - B) <= 0) {
            result = -1;
        } else {
            result = (A / (C - B)) + 1;
        }
        bw.write(result+"\n");
        bw.flush();
        bw.close();
    }
}
