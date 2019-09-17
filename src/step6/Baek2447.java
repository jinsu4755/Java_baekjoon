package step6;

import java.io.*;

public class Baek2447 {

    static char[][] star;
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        star = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                star[i][j]=' ';
            }
        }

        makeMap(0, 0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(star[i][j]);
            }
            System.out.print("\n");
        }

        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);
    }

    private static void makeMap(int x, int y, int n) {
        if (n == 1) {
            star[x][y] = '*';
            return;
        }

        int nDiv = n / 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    ;
                } else {
                    makeMap(x + (i * nDiv), y + (i * nDiv), 1);
                }
            }
        }
    }



}

