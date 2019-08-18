package step3;

import java.util.Scanner;

public class baek2739 {
    /*
    N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
     */
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }
}
