package step9;

import java.util.Scanner;

public class Baek1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        sc.close();
        int widthLen,heightLen;

        widthLen = Math.min((w - x), x);
        heightLen = Math.min((h - y), y);

        System.out.println(Math.min(widthLen, heightLen));
    }
}
