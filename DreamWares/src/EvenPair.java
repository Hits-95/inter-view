import java.util.Scanner;

public class EvenPair {

	public static boolean isEven(int num) {
		return (num % 2 == 0);
	}

	// if(num % 2 == 0)
	// return true;
	// else
	// return false;

	public static void main(String[] args) {

		int[] arr = new int[10];
		int given_num = 20;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Array : ");
		for (int i = 0; i < 10; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
				if (isEven(arr[i]) && isEven(arr[j]) && given_num == (arr[i] + arr[j]))
					System.out.println("[ " + arr[i] + ", " + arr[j] + " ]");
	}

}
