import java.util.Scanner;

public class Baek10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayOfOnePlace = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int carNumofOnePlace = sc.nextInt();
            if (dayOfOnePlace == carNumofOnePlace) {
                count++;
            }
        }
        System.out.println(count);
    }
}
