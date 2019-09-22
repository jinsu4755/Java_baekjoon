package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = br.readLine();
        br.close();
        String[] croatiaAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String alpha : croatiaAlpha) {
            inputLine = inputLine.replaceAll(alpha, "*");
        }
        System.out.println(inputLine.length());
    }
}
