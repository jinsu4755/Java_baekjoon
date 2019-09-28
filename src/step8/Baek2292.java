package step8;

import java.util.Scanner;

public class Baek2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 1;
        int backRoomNum = 1;

        while (true) {
            if (n <= backRoomNum) {
                System.out.println(count);
                break;
            }
            backRoomNum += 6 * count;
            count++;
        }
    }
}
