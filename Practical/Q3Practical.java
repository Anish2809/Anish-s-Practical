//Ask a string from user and reverse it and also convert the
//same string to upper case

package Practical;
import java.util.Scanner;

public class Q3Practical {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    // Get input from the user
	    System.out.print("Enter a string: ");
	    String string =sc.nextLine();

	    
	    StringBuilder reversedStringBuilder = new StringBuilder(string);
	    String reversedString = reversedStringBuilder.reverse().toString();
	    String toUpperCase = reversedStringBuilder.toString().toUpperCase();

	    
	    System.out.println(reversedString);
	    System.out.println(toUpperCase);
	  }
	}