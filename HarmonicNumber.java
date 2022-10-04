import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String args[]) {
		System.out.println("Enter The Number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double result = 0.0;

		System.out.println("Harmonic Number");

		while (num > 0) {
			result = result + (double) 1 / num;

			num--;
			System.out.println(result + " ");

		}
		
		System.out.println("Harmonic Number for given number :" +result);
	}

}
