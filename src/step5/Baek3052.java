package step5;

import java.util.Arrays;
import java.util.Scanner;

public class Baek3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt() % 42;
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
