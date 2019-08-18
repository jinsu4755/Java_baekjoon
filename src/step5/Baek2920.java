package step5;

import java.util.Scanner;

public class Baek2920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().replace(" ","");
        if (a.equals("12345678")) {
            System.out.println("ascending");
        } else if (a.equals("87654321")) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
