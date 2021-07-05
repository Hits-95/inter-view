import java.util.Scanner;

public class Prime_No {

	public static int prime(int num) {

		for (int i = 2; i < num; i++)
			if (num % i == 0) {
				System.out.println("No.is NOT  Prime.");
				return 0;
			}
		System.out.println("No. is Prime");
		return 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st No : ");
		prime(sc.nextInt());
	}

}
