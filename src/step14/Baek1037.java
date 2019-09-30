package step14;

import java.util.Scanner;

public class Baek1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] divisor = new int[n];
        int max = 0;
        int min = 1000000;

        for (int i = 0; i < n; i++) {
            divisor[i] = sc.nextInt();
            // 배열 초기화
            if (divisor[i] > max) {
                //최대
                max = divisor[i];
            }
            if (divisor[i] < min) {
                //최소
                min = divisor[i];
            }
        }

        System.out.println(max * min);


    }
}
