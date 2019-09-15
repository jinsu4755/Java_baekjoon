package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String intLine = br.readLine();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += intLine.charAt(i) - '0';
            //문자인 숫자는 아스키코드값 이므로 제값을 찾아주기 위해서 '0'을 빼준다.
        }

        System.out.println(sum);

    }
}