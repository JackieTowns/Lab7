import java.util.Scanner;

public class Valid {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter valid name: ");
		String input = scnr.nextLine();
		ValidName(input);

		System.out.println();

		System.out.println("Please enter valid email: ");
		String input2 = scnr.nextLine();
		ValidEmail(input2);
		
		System.out.println();

		System.out.println("Please enter valid phone number: ");
		String input3 = scnr.nextLine();
		ValidPhone(input3);

		System.out.println();
	
		System.out.println("Please enter valid date: ");
		String input4 = scnr.nextLine();
		ValidDate(input4);

	scnr.close();
	
	}

	private static boolean ValidName(String input) {
		boolean valid;

		if (input.matches("[A-Z]+[a-z]+\\s{1,30}")) {
			valid = true;
			System.out.println("This is a valid name!");
			
		} else {
			valid = false;
			System.out.println("This is a invalid name!");
		}
		return valid;
	}

	private static boolean ValidEmail(String input2) {
		boolean valid;

		if (input2.matches("[a-z]+[-][0-9]+[@][a-z]+[.][a-z]+")) {
			valid = true;
			System.out.println("This is a valid email!");

		} else {
			valid = false;
			System.out.println("This is a invalid email!");
		}
		return valid;
	}

	private static boolean ValidPhone(String input3) {
		boolean valid;


		if (input3.matches("\\(\\d{3}\\)\\s\\d{3}\\-\\d{4}")) {
			valid = true;
			System.out.println("This is a valid number!");

		} else {
			valid = false;
			System.out.println("This is a invalid number!");
		}
		return valid;
	}

	private static boolean ValidDate(String input4) {
		boolean valid;

		if (input4.matches("[0-3][0-9]\\/[0-9][0-9]\\/[0-9][0-9][0-9][0-9]")) {
			valid = true;
			System.out.println("This is a valid date!");

		} else {
			valid = false;
			System.out.println("This is a invalid date!");
		}
		return valid;
	}

}
