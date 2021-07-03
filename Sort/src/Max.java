import java.util.*;

class Max {

	private static Scanner sc;

	public int[] sort(int arr[]) {
		for (int i = 1; i < arr.length; i++)
			for (int j = 0; j < arr.length - i; j++) {

				if (arr[j] > arr[j + 1]) {

					// logic 1
					// arr[j] = arr[j] + arr[j+1];
					// arr[j+1] = arr[j] - arr[j+1];
					// arr[j] = arr[j] - arr[j+1];

//					// logic 2
//					arr[j] = arr[j] * arr[j + 1];
//					arr[j + 1] = arr[j] / arr[j + 1];
//					arr[j] = arr[j] / arr[j + 1];
					
					//login 3
					arr[j+1] = arr[j] + arr[j+1] - (arr[j] = arr[j+1]);
					

				}

			}

		return arr;
	}

	public static void main(String[] argv) {

		sc = new Scanner(System.in);
		Max obj = new Max();

		System.out.print("Enter Array size : ");
		int sz = sc.nextInt();

		int arr[] = new int[sz];

		for (int i = 0; i < sz; i++)
			arr[i] = sc.nextInt();

		obj.sort(arr);

		System.out.println("---------------------");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}
}