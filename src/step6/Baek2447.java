package step6;

import java.io.*;
import java.util.Arrays;

public class Baek2447 {

    private static char[][] star;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        star = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(star[i], ' ');
        }

        makeStar(0, 0, n);

        for (int i = 0; i < n; i++) {
            System.out.println(star[i]);
        }
    }

    private static void makeStar(int x, int y, int n) {
        if (n == 1) {
            star[x][y] = '*';
            return;
        }
        int divN = n / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }
                makeStar(x + (i * divN), y + (j * divN), divN);
            }
        }
    }



}

