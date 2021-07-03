import java.util.Scanner;

public class Pallindrome {

	public boolean isPallindrome(String str) {

		for (int i = 0; i < str.length() / 2; i++)
			if (!(str.charAt(i) == str.charAt(str.length() - (i + 1))))
				return false;
		return true;
	}

	public static void main(String[] argv) {

		Pallindrome obj = new Pallindrome();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String : ");
		String str = sc.next();

		if (obj.isPallindrome(str))
			System.out.println("Pallindrome");
		else
			System.out.println("Not pallindrome.");
	}
}
