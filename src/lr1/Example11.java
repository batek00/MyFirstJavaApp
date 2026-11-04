package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите текущий год: ");
        int currentYear = in.nextInt();
        System.out.println("Введите год рождения: ");
        int year = in.nextInt();
        int age = currentYear - year;
        String yearsOld;
        if (age == 1 || (age > 20 && age % 10 == 1)) {
            yearsOld = "год";
        } else if ((age >= 2 && age <= 4) || (age > 21 && (age % 10 == 2 || age % 10 == 3 || age % 10 == 4))) {
            yearsOld = "года";
        } else {
            yearsOld = "лет";
        }

        System.out.printf("%s, %d (или %d, если дня рождения в этом году еще не было) %s \n", name, age, age -1, yearsOld);
    }
}