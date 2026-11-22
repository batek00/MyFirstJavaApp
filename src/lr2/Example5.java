package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число от 1000: ");
        double num = in.nextDouble();
        if (num < 1000) {
            System.out.println("Ошибка! Число должно быть от 1000!");
        } else {
            int wholeNum = (int) num;
            int thou = wholeNum / 1000;
            String stringNum = "" + wholeNum;
            int len = stringNum.length();
            int fourthChar = len - 4;
            char fourth = stringNum.charAt(fourthChar);
            System.out.printf("Четвертая цифра справа в десятичном представлении числа: %c \n", fourth);
            System.out.printf("Во введенном числе %d тысяч \n", thou);
        }
        in.close();
    }
}