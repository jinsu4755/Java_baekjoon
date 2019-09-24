package step7;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testStr = br.readLine();
        int[] alpha = new int[26];

        for (int i = 0; i < testStr.length(); i++) {
            int countNum = Character.toUpperCase(testStr.charAt(i)) - 'A';
            alpha[countNum] +=1;
        }
        int max = -1;
        char result = '?';
        for (int i = 0; i < 26; i++) {
            if (alpha[i] > max) {
                max = alpha[i];
                result = (char) ('A' + i);
            } else if (alpha[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}
