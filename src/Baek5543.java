import java.util.Scanner;

public class Baek5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buggerMin =2001;
        int drinkMin = 2001;
        for (int i = 0; i < 3; i++) {
            int bugger = sc.nextInt();
            if (buggerMin >= bugger) {
                buggerMin = bugger;
            }
        }
        for (int i = 0; i < 2; i++) {
            int drink = sc.nextInt();
            if (drinkMin >= drink) {
                drinkMin = drink;
            }
        }

        System.out.println(buggerMin + drinkMin - 50);
    }
}
