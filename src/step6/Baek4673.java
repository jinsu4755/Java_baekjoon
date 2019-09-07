package step6;

public class Baek4673 {
    public static void main(String[] args) {
        boolean[] isNotSelfNumber = new boolean[10000];
        for (int i = 1; i <= isNotSelfNumber.length; i++) {
            int dn = checkNumber(i);
            if (dn <= 10000) {
                isNotSelfNumber[dn - 1] = true;
            }
        }
        for (int i = 1; i <= isNotSelfNumber.length; i++) {
            if (!isNotSelfNumber[i - 1]) {
                System.out.println(i);
            }
        }
    }

    static int checkNumber(int n) {
        int result = n;
        while (n != 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}