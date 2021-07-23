import java.util.Scanner;

public class Second {

	public static boolean isVowel(char ch) {

		switch (ch) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		// read String
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String  : ");
		String str = sc.next();

		for (int i = 0; i < str.length(); i++)
			if (isVowel(str.charAt(i)))
				System.out.print(str.charAt(i - 1) + ", " + str.charAt(i + 1) + ", ");
	}

}
