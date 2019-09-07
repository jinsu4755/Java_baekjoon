package step6;

import java.util.Scanner;

public class Baek1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(countNum(n));
    }

    static int countNum(int n) {
        int count = 0;
        if (n <= 99) {
            for (int i = 1; i <= n; i++) {
                /*1~99까지는 모두 한수로 취급*/
                count++;
            }
        } else {
            for (int i = 100; i <= n; i++) {
                int hundredNum = i / 100, tenNum = i % 100 / 10, oneNum = i % 10;
                // 입력이 1000이어도 1000일때는 한수가 아니므로 999와 동일한 count, 10 0 0으로 계산해도 결과 동일
                if (hundredNum + oneNum == tenNum * 2) {
                    //등차수열의 성질로 한수인지 판별한다
                    count++;
                }
            }
            count += 99; // 1~99까지 99개 이므로 100부터 카운팅한 값에 더해준다
        }
        return count;
    }
}
