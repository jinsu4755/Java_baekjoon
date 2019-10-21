package step9;

import java.util.Scanner;

public class Baek3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();


        if (x1 == x2) {
            // x좌표는 x3이어야한다.
            if (y3 == y1) {
                //y좌표는 y2이다.
                System.out.println(x3 + " " + y2);
            }
            if (y3 == y2) {
                // y좌표는 y1이다.
                System.out.println(x3 + " " + y1);
            }
        }
        if (x1 == x3) {
            //x좌표는 x2
            if (y2 == y1) {
                //y좌표 y3
                System.out.println(x2+" "+y3);
            }
            if (y2 == y3) {
                //y좌표 y1
                System.out.printf("%d %d\n", x2,y1);
            }
        }
        if (x2 == x3) {
            //x좌표 x1
            if (y1 == y2) {
                //y3
                System.out.printf("%d %d\n", x1,y3);
            }
            if (y1 == y3) {
                //y2
                System.out.printf("%d %d\n", x1,y2);
            }
        }


    }
}
