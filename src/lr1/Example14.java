package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a, b, c;

        System.out.println("Введите число: ");
        double num = in.nextDouble();

        a = num - 1;
        b = num + 1;
        c = (a + b + num)*(a + b + num);

        System.out.printf("%.2f %.2f %.2f %.2f \n", a, num, b, c);
        in.close();
    }
}