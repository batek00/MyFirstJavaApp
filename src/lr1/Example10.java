package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текущий год: ");
        int currentYear = in.nextInt();
        System.out.println("Введите год рождения: ");
        int year = in.nextInt();
        int age = currentYear - year;

        System.out.printf("Возраст пользователя: %d (или %d, если дня рождения в этом году еще не было) \n", age, age - 1);
        in.close();
    }
}