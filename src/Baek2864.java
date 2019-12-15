import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek2864 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        String firstNum = st.nextToken();
        String secondNum = st.nextToken();
        int maxNum = Integer.parseInt(firstNum.replaceAll("5", "6")) + Integer.parseInt(secondNum.replaceAll("5", "6"));
        int minNum = Integer.parseInt(firstNum.replaceAll("6", "5")) + Integer.parseInt(secondNum.replaceAll("6", "5"));
        System.out.println(minNum + " " + maxNum);
        sc.close();
    }
}
