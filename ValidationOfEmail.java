package assisted_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfEmail {
	public static boolean isValidEmail(String emailid) {
		String regex = "^(.+)@(.+)$";
		 //initialize the Pattern object
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailid);
		return matcher.matches();
		}

	public static void main(String[] args) {
		
		List<String> emailstrings = new ArrayList<String>();
		// valid email addresses
		emailstrings.add("Jayalakshmi@loginid.com");
		emailstrings.add("Boregowda@loginid.com");
		emailstrings.add("Pallavi@loginid.me.org");
		//invalid email addresses
		emailstrings.add("Guru.example.com");
		emailstrings.add("Pavithra..b@loginiBoregowda@loginid.comd.com");
		emailstrings.add("Ashray@.loginid.com");
		for (String emailvalid : emailstrings) {
		System.out.println("The Email address " + emailvalid + " is " + (isValidEmail(emailvalid) ? "valid one " : "not a valid one"));
		}
		System.out.println("Enter any email address to check");
				       Scanner enteredinput = new Scanner(System.in);
				       String input = enteredinput.nextLine();
				       System.out.println("The Email address what you are  entered one becomes  " + input + " now " + (isValidEmail(input) ? "valid" : "invalid"));
	}
}
