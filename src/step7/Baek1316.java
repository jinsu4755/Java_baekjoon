package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] textLine = new String[n];
        int groupWord = n;

        for (int i = 0; i < textLine.length; i++) {
            textLine[i] = br.readLine();
            boolean[] groupCheck = new boolean[26];

            for (int j = 1; j < textLine[i].length(); j++) {
                if ((j - 1) == 0) {
                    groupCheck[textLine[i].charAt(j - 1) - 'a'] = true;
                }
                if (textLine[i].charAt(j - 1) != textLine[i].charAt(j)) {
                    int checker = textLine[i].charAt(j) - 'a';
                    if (groupCheck[checker]) {
                        groupWord--;
                        break;
                    }
                    groupCheck[checker] = true;
                }
            }
        }
        System.out.println(groupWord);
    }
}
