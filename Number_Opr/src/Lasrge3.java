import java.util.Scanner;

public class Lasrge3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st No : ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2st No : ");
		int num2 = sc.nextInt();
		System.out.print("Enter 3st No : ");
		int num3 = sc.nextInt();
		
		int large = (num1 > num2) ? (num1 > num3) ? num1 : num3 : (num2 > num3) ? num2 : num3;
		System.out.println("Largest : " + large);
	}

}
