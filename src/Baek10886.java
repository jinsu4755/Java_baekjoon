import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String vote = br.readLine();
            if (vote.equals("1")) {
                count++;
            }
        }
        if (count <= n / 2) {
            System.out.println("Junhee is not cute!");
        } else {
            System.out.println("Junhee is cute!");
        }

    }
}
