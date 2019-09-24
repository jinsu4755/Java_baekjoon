package step7;

import java.util.Scanner;

public class Baek11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int asc = sc.next().charAt(0);
        /*
        char 값은 아스키 코드값으로 8비트 정수형값을 가진다. 8비트 정수형을 출력시 문자로
        System.out.printf("%c", asc); Input = A -> Output -> A
        System.out.printf("%d", asc); Input = A -> Output -> 65
         */
        System.out.println(asc);

    }
}
