package step5;

import java.util.Arrays;
import java.util.Scanner;

public class Baek10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[n - 1];

        System.out.println(min + " " + max);
    }
}
