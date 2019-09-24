package step7;

import java.util.Scanner;

public class Baek2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int re = 0; re < n; re++) {
            int r = sc.nextInt();
            String testStr = sc.next();

            for (int i = 0; i < testStr.length(); i++) {
                for (int j = 0; j < r; j++) {
                    System.out.print(testStr.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
