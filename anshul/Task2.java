//Q2.  Calculate the years, months, and days from a given integer. Also, implement the necessary conditional statements to make sure the number entered is a positive, non-zero integer.
import java.util.Scanner;
class Task2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("enter Number of days");
		int balance, y, m, d;
		System.out.print("Enter total days: ");
		int numberOfDays = sc.nextInt();
		y =  numberOfDays / 365;
		balance = numberOfDays % 365;
		m = balance / 30;
		d = balance % 30;
		System.out.println("In years");
        System.out.println("Number of years: " + y);
		System.out.println("Number of months: " + m);
		System.out.println("Number of days: " + d);
        sc.close();
    }
}