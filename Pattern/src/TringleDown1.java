import java.util.Scanner;

public class TringleDown1 {

	public static void main(String[] argv) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int n = sc.nextInt();

		// * * * *
		// * * *
		// * *
		// *

		for (int i = n; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		// 4 4 4 4
		// 3 3 3
		// 2 2
		// 1

		for (int i = n; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}

		// 0 1 2 3
		// 0 1 2
		// 0 1
		// 0
		for (int i = n; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}

		// 0 1 2 3
		// 4 5 6
		// 7 8
		// 9
		int temp = 0;
		for (int i = n; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" " + temp++);
			}
			System.out.println();
		}

	}
}
