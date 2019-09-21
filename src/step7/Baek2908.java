package step7;

import java.util.Scanner;

public class Baek2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer numA = new StringBuffer(sc.next());
        StringBuffer numB = new StringBuffer(sc.next());
        sc.close();
        int numIntegerA = Integer.parseInt(numA.reverse().toString());
        int numIntegerB = Integer.parseInt(numB.reverse().toString());

        if (numIntegerA > numIntegerB) {
            System.out.println(numIntegerA);
        } else {
            System.out.println(numIntegerB);
        }
    }
}
