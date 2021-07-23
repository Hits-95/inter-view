import java.util.Scanner;

public class FirstUpperCase {

	public static boolean isUpperVowel(char ch) {
		
		switch (ch) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		}
		return false;
	}

	// main
	public static void main(String[] args) {

		// read String
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String  : ");
		String str = sc.next();

		// get single char from str and pass to function
		for (int i = 0; i < str.length(); i++)

			if (isUpperVowel(str.charAt(i))) {
				System.out.println("1st Letter " + str.charAt(i));
				break;
			}
	}

}
