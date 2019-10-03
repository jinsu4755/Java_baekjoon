package step14;

import java.util.Scanner;

public class Baek11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                n /= i;
                System.out.println(i--);
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
    }
}

