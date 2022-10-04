import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = sc.nextInt();

		for (int i = 2; i < num; i++) {

			while (num % i == 0) {
				num = num / i;
			  System.out.println(i);
				
			}
		}
		if (num !=1) {
			System.out.println("Print The Prime Number :" +num);
		}
	}

}
