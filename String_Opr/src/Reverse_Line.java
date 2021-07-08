import java.util.Scanner;

public class Reverse_Line {

	// reverse string...
	public static void reverseLine(String str) {

		String temp = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			temp += str.charAt(i);
		}

		System.out.print(temp + " ");
	}

	// read line in reverse oder
	public void readLine(String line) {

		String str = "";

		for (int i = line.length() - 1; i >= 0; i--) {

			if (line.charAt(i) == ' ') {
				Reverse_Line.reverseLine(str);
				str = "";
			}

			else
				str += line.charAt(i);
		}

		Reverse_Line.reverseLine(str);
	}

	// main body
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Reverse_Line obj = new Reverse_Line();

		System.out.print("Enter Line : ");
		String line = sc.nextLine();

		obj.readLine(line);

	}

}
