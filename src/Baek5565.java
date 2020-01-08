import java.util.Scanner;

public class Baek5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bookPrice = new int[10];
        int result = 0;

        for (int i = 0; i < bookPrice.length; i++) {
            bookPrice[i] = sc.nextInt();
            if (i > 0) {
                result += bookPrice[i];
            }
        }
        System.out.println(bookPrice[0] - result);
    }
}
