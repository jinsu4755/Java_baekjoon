package step9;


import java.util.Scanner;

public class Baek1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            boolean isPrimeNum = true;

            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
            if (num != 1 && isPrimeNum) {
                count++;
            }
        }
        System.out.println(count);
    }
}
