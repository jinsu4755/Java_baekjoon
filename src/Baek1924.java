import java.util.Scanner;

public class Baek1924 {
    public static void main(String[] args) {
        String[] dayOfWeeks = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] dayMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int total = day;

        for (int i = 0; i < month - 1; i++) {
            total += dayMonth[i];
        }

        System.out.println(dayOfWeeks[total % 7]);
    }
}
