package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней в этом месяце: ");
        int daysCount = in.nextInt();

        if (daysCount < 28 || daysCount > 31) {
            System.out.println("В месяце может быть от 28 до 31 дня!");
        } else {
            String days;

            if (daysCount % 10 == 1) {
                days = "день";
            } else {
                days = "дней";
            }

            System.out.printf("%s содержит %d %s \n", month, daysCount, days);
        }
        in.close();
    }
}