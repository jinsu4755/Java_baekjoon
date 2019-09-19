package step7;

import java.util.Scanner;

public class Baek10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String sStr = sc.nextLine();

        for (char c = 'a'; c != 'z' + 1; c++) {
            sb.append(sStr.indexOf(c));
            sb.append(' ');
        }
        System.out.println(sb);
    }
}
