import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            String[] arrStr = br.readLine().split(" ");
            for (int j = 0; j < arrStr.length; j++) {
                sum += Integer.parseInt(arrStr[j]);
            }

            if (sum == 3) {
                System.out.println("A");
            } else if (sum == 2) {
                System.out.println("B");
            } else if (sum == 1) {
                System.out.println("C");
            } else if (sum == 0) {
                System.out.println("D");
            } else if (sum == 4) {
                System.out.println("E");
            }
        }
    }
}
