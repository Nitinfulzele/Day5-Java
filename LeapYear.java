import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Enter a year: ");
		year = sc.nextInt();
		sc.close();

		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + " Is a leap year");

		} else if (year % 400 == 0) {
			System.out.println(year + " Is a leap year");

		} else {
			System.out.println(year + " Is not leap year");
		}

	}

}
