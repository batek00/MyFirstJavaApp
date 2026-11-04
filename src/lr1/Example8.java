package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String dayOfWeek = in.nextLine();

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите сегодняшнее число: ");
        int date = in.nextInt();

        System.out.printf("Сегодня %s, %d, %s \n", dayOfWeek, date, month);
        in.close();
    }
}