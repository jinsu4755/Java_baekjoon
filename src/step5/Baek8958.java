package step5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        String[][] str_ox = new String[test_case][];

        for (int i = 0; i < test_case; i++) {
            str_ox[i] = br.readLine().split("");
            int bonus = 1;
            int result = 0;
            for (int j = 0; j < str_ox[i].length; j++) {
                if (str_ox[i][j].equals("O")) {
                    if (j >= 1 && str_ox[i][j - 1].equals("O")) {
                        bonus++;
                        result += bonus;
                    } else {
                        result += bonus;
                    }
                } else {
                    bonus = 1;
                }
            }
            System.out.println(result);
        }
        br.close();
    }
}
