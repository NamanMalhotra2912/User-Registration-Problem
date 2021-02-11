package Regex;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Valid_Name {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Name where first character should be capital");
		String firstName = sc.next();
		System.out.println(Pattern.matches("^[A-Z]{1}[a-z]{2,20}", firstName));
	
	}
}
