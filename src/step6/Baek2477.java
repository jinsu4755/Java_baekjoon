package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //draw(Integer.parseInt(br.readLine()));
        br.close();
    }

//재귀 함수 구현하기!!
//    public static void draw(int num) {
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                int x = i, y = j;
//                while (x > 0) {
//                    if (x % 3 == 1 && y % 3 == 1) {
//                        break;
//                    }
//                    x /= 3; y /= 3;
//                }
//                System.out.printf("%c", x==0?'*':' ');
//            }
//            System.out.printf("\n");
//        }
//    }
}
