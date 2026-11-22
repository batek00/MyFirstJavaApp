package lr2;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("Введите число: ");
	    double num = in.nextDouble();
	    if ((num <= 10) && (num >= 5)) {
	        System.out.println("Введенное число подходит");
	    } else {
	        System.out.println("Введенное число не подходит");
	    }
	    in.close();
	}
}