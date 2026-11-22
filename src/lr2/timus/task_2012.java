package lr2.timus;

import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int f = in.nextInt();
        int remainingTasks = 12 - f;
        int canBeSolved = (4*60)/45;
        if (canBeSolved - remainingTasks >= 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        in.close();
    }
}