package step4;

import java.util.Scanner;

public class Baek1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int count = 0;
        int number = n;


        do {
            n = (n % 10) * 10 + (n / 10 + n % 10) % 10;
            count++;
        } while (n != number);
        System.out.println(count);
    }
}
