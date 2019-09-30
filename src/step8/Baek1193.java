package step8;

import java.util.Scanner;

public class Baek1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int line = 1;
        int countLine = 1;
        while (!(n <= countLine)) {
            //countLine으로 해당 라인에 총 몇번 까지 있는지 확인
            //line으로 해당 라인이 몇번 째 라인인지 확인
            countLine += line + 1;
            line++;
        }
        if (line % 2 == 1) {
            int numerator = 1;
            for (int i = 0; i < countLine - n; i++) {
                numerator++;
                line--;
            }
            System.out.println(numerator +"/"+line);
        } else {
            int denominator = 1;
            for (int i = 0; i < countLine - n; i++) {
                denominator ++;
                line--;
            }
            System.out.println(line +"/"+ denominator);
        }
    }
}
