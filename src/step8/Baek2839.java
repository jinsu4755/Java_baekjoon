package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = n / 5; i > 0; i--) {
            if ((n - (5 * i)) % 3 == 0) {
                System.out.println(i + ((n - (5 * i)) / 3));
                return;
            }
        }
        if (n % 5 == 0) {
            System.out.println(n / 5);
        } else if (n % 3 == 0) {
            System.out.println(n / 3);
        } else {
            System.out.println(-1);
        }

    }
}
