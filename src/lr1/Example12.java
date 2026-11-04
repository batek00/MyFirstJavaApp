package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текущий год: ");
        int currentYear = in.nextInt();
        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();
        int yearOfBirth = currentYear - age;

        System.out.printf("Ваш год рождения: %d (или %d, если дня рождения в этом году еще не было) \n", yearOfBirth, (yearOfBirth - 1));
        in.close();
    }
}