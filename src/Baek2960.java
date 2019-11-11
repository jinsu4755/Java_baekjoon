import java.util.Arrays;
import java.util.Scanner;

public class Baek2960 {
    /*에라토스테네스의 체 - 소수 구하기 알고리즘*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] eratos = new boolean[n + 1];
        Arrays.fill(eratos, true);

        int count=0;

        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                if(!eratos[j]) continue;
                count++;
                eratos[j] = false;
                if (count == k) {
                    System.out.println(j);
                }
            }
        }


    }
}
