import java.util.Scanner;

public class Baek1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcaseT = sc.nextInt();

        for (int i = 0; i < testcaseT; i++) {
            int numA = sc.nextInt();
            int numB = sc.nextInt();

            System.out.println(numA * numB / gcd(numA, numB));
        }
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
