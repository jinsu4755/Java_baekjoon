import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char[] banWord = {
                'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'
        };

        for (char ban : banWord) {
            word = word.replace(ban, ' ');
        }
        String[] result = word.split(" ");
        for (String s : result) {
            System.out.print(s);
        }
    }
}
