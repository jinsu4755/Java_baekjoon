package step9;

import java.util.Scanner;

public class Baek2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        int min = n;
        for (; m <= n; m++) {
            boolean isPrimeNum = true;

            for (int j = 2; j <= Math.sqrt(m); j++) {
                if (m % j == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
            if (isPrimeNum) {
                if (m != 1) {
                    sum += m;
                    if (min > m) {
                        min = m;
                    }
                }
            }
        }
        if (sum == 0) {
            //소수가 없으므로 합이 계산되지 않음
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
