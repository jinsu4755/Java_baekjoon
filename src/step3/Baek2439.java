package step3;

import java.util.Scanner;

public class Baek2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int j, i = 1; i <= n; i++) {

            //공백 출력
            for (j = 0; j < n - i; j++) {
                System.out.printf(" ");
            }
            //별 출력
            for (; j < n; j++) {
                System.out.printf("*");
            }
            //줄 바꿈
            System.out.printf("\n");
        }
    }
}
