package lr2.timus;

import java.util.Scanner;

public class task_1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int code1 = in.nextInt();
        int code2 = in.nextInt();
        if (code1 % 2 == 1 && code2 % 2 == 0) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
        in.close();
    }
}