package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class IntegerStack {
    private int[] s;
    private int top;
    public IntegerStack() {
        s = new int[1];
        top = -1;
    }

    public int size() {
        return top + 1;
    }
    public boolean isEmpty() {
        return (top == -1);
    }

    private void resize(int newSize) {
        s = Arrays.copyOf(s, newSize);
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return s[top];
        }
    }

    public void push(int n) {
        if (size() == s.length) {
            resize(2 * size());
        }
        s[++top] = n;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int result = s[top--];

        if (size() == s.length / 4) {
            resize(s.length / 2);
        }
        return result;
    }
}



public class Baek10828 {
    public static void main(String[] arag) throws IOException {
        IntegerStack istack = new IntegerStack();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] cmd = br.readLine().split(" ");

            if (cmd[0].equals("push")) {
                istack.push(Integer.parseInt(cmd[1]));
            } else if (cmd[0].equals("pop")) {
                System.out.println(istack.pop());
            } else if (cmd[0].equals("size")) {
                System.out.println(istack.size());
            } else if (cmd[0].equals("empty")) {
                if (istack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (cmd[0].equals("top")) {
                System.out.println(istack.peek());
            }
        }
    }
}






