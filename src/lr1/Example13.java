package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a;

        System.out.println("Введите первое число: ");
        double num1 = in.nextDouble();

        System.out.println("Введите второе число: ");
        double num2 = in.nextDouble();

        a = num2 + num1;

        System.out.printf("Получилось число: %.2f \n", a);
        in.close();
    }
}