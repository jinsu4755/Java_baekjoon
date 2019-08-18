package step2;

import java.util.Scanner;

public class Baek10817 {
    /*
    세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println(b);
                } else {
                    System.out.println(c);
                }
            } else {
                System.out.println(a);
            }
        } else {
            if (b > c) {
                if (a > c) {
                    System.out.println(a);
                } else {
                    System.out.println(c);
                }
            } else {
                System.out.println(b);
            }
        }
    }
}
