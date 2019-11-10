import java.util.Scanner;

public class Baek2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();

        if (numA == numB && numB == numC) {
            System.out.println(10000 + numA * 1000);
        } else if (numA != numB && numB != numC && numA != numC) {
            int bigNum = Math.max(Math.max(numA, numB), numC);
            System.out.println(bigNum * 100);
        } else {
            int sameNum;
            if (numA == numB) {
                sameNum = numA;
            } else {
                sameNum = numC;
            }
            System.out.println(1000 + sameNum * 100);
        }
    }
}
