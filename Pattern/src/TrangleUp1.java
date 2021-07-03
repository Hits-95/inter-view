import java.util.Scanner;

public class TrangleUp1 {

	public static void main(String[] argv) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int n = sc.nextInt();

		// *
		// * *
		// * * *
		// * * * *

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		// 0
		// 1 1
		// 2 2 2
		// 3 3 3 3
		// 4 4 4 4 4
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}

		// 0
		// 0 1
		// 0 1 2
		// 0 1 2 3
		// 0 1 2 3 4
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
		
		// 0
		// 1 2
		// 3 4 5
		// 6 7 8 9
		// 10 11 12 13 14
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + temp++);
			}
			System.out.println();
		}
	}
}
