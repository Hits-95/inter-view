import java.util.Scanner;

public class Single {

	public static void findSingle(int arr[]) {

		int i;
		int count[] = new int[10];

		for (i = 0; i < 10; i++)
			count[arr[i]]++;

		// find single
		for (i = 0; i < 10; i++)
			if (count[i] == 1)
				System.out.println("Result -> " + i);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];

		System.out.print("Enter Array : ");
		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();
		findSingle(arr);
	}

}
