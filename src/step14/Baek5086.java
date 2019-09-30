package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstNum = Integer.parseInt(st.nextToken());
            int secondNum = Integer.parseInt(st.nextToken());

            if (firstNum == 0 && secondNum == 0) {
                return;
            } else if (firstNum % secondNum == 0) {
                System.out.println("multiple");
            } else if (secondNum % firstNum == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }

        }
    }
}
