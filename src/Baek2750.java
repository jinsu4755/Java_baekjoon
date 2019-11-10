import java.util.Arrays;
import java.util.Scanner;

public class Baek2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testN = sc.nextInt();

        int[] arr = new int[testN];

        for (int i = 0; i < testN; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < testN; i++) {
            System.out.println(arr[i]);
        }
    }
}
