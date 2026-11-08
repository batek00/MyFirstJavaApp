package lr1.Timus.task_1409;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int shotCansHarry = in.nextInt();
        int shotCansLarry = in.nextInt();
        int sumCans = shotCansLarry + shotCansHarry - 1;
        int notShotCansHarry = sumCans - shotCansHarry;
        int notShotCansLarry = sumCans - shotCansLarry;

        System.out.printf("%d %d \n", notShotCansHarry, notShotCansLarry);
    }
}
