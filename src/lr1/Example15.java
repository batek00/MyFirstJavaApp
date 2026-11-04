package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a, b;

        System.out.println("Введите первое число: ");
        double num1 = in.nextDouble();

        System.out.println("Введите второе число: ");
        double num2 = in.nextDouble();

        a = num1 + num2;
        b = num1 - num2;

        System.out.printf("Сумма двух чисел: %.2f \nРазность двух чисел: %.2f \n", a, b);
        in.close();
    }
}