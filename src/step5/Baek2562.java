package step5;

import java.util.Scanner;

public class Baek2562 {
    public static void main(String[] args){
        int[] arr = new int[9];
        int max = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
                count = i + 1;
            }
        }
        System.out.println(max+"\n"+ count);
    }
}
