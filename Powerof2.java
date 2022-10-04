
public class Powerof2 {

	public static void main(String[] args) {

		int N, mul = 1;

	N = Integer.parseInt(args[0]);

		if ( N <= 31) {
			
			System.out.println("value of number should be less than 31");
			return;

		} else {
			System.out.println(mul);
			for (int j = 1; j < N; j++) {
				mul = mul * 2;
				System.out.println(mul);
			}

		}
    }

}
