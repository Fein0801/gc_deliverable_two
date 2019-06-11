package deliverable_two;

import java.util.Scanner;

public class UnicodeCalculator {

    /*
     * Takes two strings and compares their value based on the unicode character
     * values (in base ten).
     * 
     * Supports any character including "•".
     */

    // Author: Ben Feinstein

    public static void main(String[] args) {

	char bullet = '\u2022'; // This is a bullet character

	Scanner scan = new Scanner(System.in);

	String userStr1;
	String userStr2;

	// Get 2 strings to compare from input
	System.out.println("Enter first string to compare: ");
	System.out.print("> ");
	userStr1 = scan.nextLine();

	System.out.println("Enter second string to compare: ");
	System.out.print("> ");
	userStr2 = scan.nextLine();
	//

	// Add a double line
	System.out.println("=====================");

	// Initialize "string values" to zero to save headaches
	int userStr1Val = 0;
	int userStr2Val = 0;

	// Get value of string 1, and print each letter's value
	for (int i = 0; i < userStr1.length(); i++) {
	    char currentChar = userStr1.charAt(i);
	    int currentCharValue = (int) currentChar;

	    // Print a string "• [currentChar] : [currentCharValue]"
	    System.out.println("" + bullet + " " + currentChar + " : " + currentCharValue);

	    // Add currentCharValue to userStr1Val
	    userStr1Val += currentCharValue;
	}

	System.out.println("String 1 total: " + userStr1Val);

	// Add a double line
	System.out.println("=====================");

	// Get value of string 2, and print each letter's value
	for (int i = 0; i < userStr2.length(); i++) {
	    char currentChar = userStr2.charAt(i);
	    int currentCharValue = (int) currentChar;

	    // Print a string "• [currentChar] : [currentCharValue]"
	    System.out.println("" + bullet + " " + currentChar + " : " + currentCharValue);

	    // Add currentCharValue to userStr2Val
	    userStr2Val += currentCharValue;
	}

	System.out.println("String 2 total: " + userStr2Val);

	// Add a double line
	System.out.println("=====================");

	// Calculate the difference between the two strings as absolute value
	int diffBtwnStrings = Math.abs(userStr2Val - userStr1Val); // "diff" means "difference"

	// Output the difference
	System.out.println("Difference (as absolute value): " + diffBtwnStrings);

	// Close the scanner
	scan.close();
    }

}
