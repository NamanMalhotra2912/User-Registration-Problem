package Regex;
import java.util.Scanner;
import java.util.regex.*;
public class Validate_lastName {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = sc.next();
		System.out.println("First name is : "+firstName);
		
		System.out.println("Enter your last name");
		String lastName = sc.next();
		System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,10}", lastName));
				
	}
}
