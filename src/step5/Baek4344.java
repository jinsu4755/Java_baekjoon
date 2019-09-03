package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        String[][] line = new String[test_case][];

        for (int i = 0; i < test_case; i++) {
            line[i] = br.readLine().split(" ");
            int sum = 0;
            int avg = 0;
            double count = 0;
            for (int j = 1; j <= Integer.parseInt(line[i][0]); j++) {
                sum += Integer.parseInt(line[i][j]);
            }
            avg = sum / Integer.parseInt(line[i][0]);
            for (int j = 1; j <= Integer.parseInt(line[i][0]); j++) {
                if (Integer.parseInt(line[i][j]) > avg) {
                    count ++;
                }
            }
            System.out.printf("%.3f%%\n", (count / Integer.parseInt(line[i][0])) * 100);
        }
    }
}
