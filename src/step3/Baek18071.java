package step3;

import java.util.Scanner;

public class Baek18071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        String str = "";
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp < x) {
                str += (temp + " ");
            }
        }
        System.out.println(str);
    }
}
