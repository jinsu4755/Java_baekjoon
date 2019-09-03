package step5;

import java.util.Scanner;

public class Baek1549 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int max = 1;
        double sum = 0.0;
        int[] arr_x = new int[x];

        for (int i = 0; i < x; i++) {
            arr_x[i] = sc.nextInt();

            if (max < arr_x[i]) {
                max = arr_x[i];
            }
            sum += arr_x[i];
        }
        sum = ((sum / max) * 100.0) / x;
        System.out.printf("%.2f", sum);

    }
}
