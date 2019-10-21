import java.util.Scanner;

public class Baek5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int count =0;
        int change = 1000 - price;

        count += change / 500;
        count += change % 500 / 100;
        count += change % 500 % 100 / 50;
        count += change % 500 % 100 % 50 / 10;
        count += change % 500 % 100 % 50 % 10 / 5;
        count += change % 500 % 100 % 50 % 10 % 5;

        System.out.println(count);
    }
}
