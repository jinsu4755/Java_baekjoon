package step7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textLine = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(textLine, " ");
        System.out.println(st.countTokens());
    }
}
