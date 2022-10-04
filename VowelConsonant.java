import java.util.Scanner;
public class VowelConsonant {
	
	public static void main(String[] args) {
		char ch;
		int count=0;
		char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter an Alphabet :");
		ch = sc.next().charAt(0);
		
		for (int i=0; i<10; i++) {
			if(ch==vowels[i]) {
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println(ch + " is a Consonant");
		else 
			System.out.println(ch + " is a Vowel");
	}

}
