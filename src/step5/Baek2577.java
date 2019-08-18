package step5;

import java.util.Scanner;

public class Baek2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int[] count = new int[10];
        String result = (a * b * c) + "";
        for (int i = 0; i < result.length(); i++) {
            count[result.charAt(i) - '0']++;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
}
