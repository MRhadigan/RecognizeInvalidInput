import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RecognizeInvalidInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		String cont = "y";
		do {
		// Asking for the user name 
		System.out.println("Please enter your name");
		String userName = scan.nextLine();
		System.out.println(stringNames(userName));
		
		// Asking for the user email address
		System.out.println("Please enter your Email Address");
		String userEmail = scan.nextLine();
		System.out.println(stringEmail(userEmail));
		
		// Asking for the user phone number
		System.out.println("Please enter your Phone number");
		String userPhone = scan.nextLine();
		System.out.println(charPhone(userPhone));
		
		// Asking for the user date
		System.out.println("Please enter a date");
		String userDate = scan.nextLine();
		System.out.println(charDate(userDate));

		// Asking if user wants to continue
		System.out.println("Do you wish to continue?");
		cont = scan.nextLine();
		} while (cont.equalsIgnoreCase("y"));

		System.out.println("Goodbye!");
		

		scan.close();
	}
	// Method for checking name
	public static String stringNames(String inputName) {
		// Making sure the name is only letters and can't go higher than 30 letters
		Pattern p = Pattern.compile("^[a-zA-Z]{1,30}$");
		Matcher m = p.matcher(inputName);
		String s = " ";

		
		if (m.matches()) {
			// Checking that the first letter is Upper Case
			if (inputName.charAt(0) == (inputName.toLowerCase().charAt(0))) {
				return inputName + " needs to start with a capital letter";
			}
			return inputName + " Is a valid Name";
		} else {
			return inputName + " Is NOT a valid Name";
		}

	}
	
	// Method for checking email
	public static String stringEmail(String inputEmail) {
		// Make sure the email is letters or numbers, and splitting the email up at the @ and . symbols
		Pattern p = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$");
		Matcher m = p.matcher(inputEmail);
		
		if(m.matches() ) {
			return inputEmail + " Is a valid Email";
		}else {
		return inputEmail + " Is NOT a valid Email";
		}
	}
	
	// Method for checking the phone number
	public static CharSequence charPhone(CharSequence inputPhone) {
		// Make sure the phone number is only numbers, and the correct format 555-555-5555
		Pattern p = Pattern.compile("^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$");
		Matcher m = p.matcher(inputPhone);
		
		if(m.matches()) {
			return inputPhone + " Is a valid Phone number";
	} else {
		return inputPhone + "Is NOT a valid Phone number";
		}
		
	}	
		
	// Method for checking the date
	public static CharSequence charDate(CharSequence inputDate) {
		// Make sure the date is only numbers, and the correct format DD/MM/YYYY
		Pattern p = Pattern.compile("^(1\\/)?[0-9]{2}\\/?[0-9]{2}\\/?[0-9]{4}$");
		Matcher m = p.matcher(inputDate);
		
		if(m.matches()) {
			return inputDate + " Is a valid Date";
		} else {
			return inputDate + " Is NOT a valid Date";
		}
			
	}
		

	}

	
	

