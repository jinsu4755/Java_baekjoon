import java.util.Scanner;

public class beak2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int time = sc.nextInt();

        int newMinute = (minute + time) % 60;
        int newHour = hour + (minute + time) / 60;
        if (newHour >= 24) {
            newHour -= 24;
        }

        System.out.println(newHour + " " + newMinute);
    }
}
