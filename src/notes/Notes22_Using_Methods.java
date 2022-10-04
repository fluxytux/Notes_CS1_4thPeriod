package notes;

import java.util.Scanner;

/*
 * Write 1 time.  Use infinite times.
 * 
 * That's what Object Oriented Programming
 * is all about.
 * 
 * Basically, methods are small pieces of the puzzle
 * intended to be reused as much as necessary.  
 * 
 * Pros
 *   - Write code only 1 time
 *   - If it's broken or needs to
 *       be edited, you only need 
 *       to fix one place
 *   - 
 * 
 * 
 */

public class Notes22_Using_Methods {

	public static String[] words = {"hello", "goodbye", "lollypop", "lavendar"};; 
	
	public static String getString(String instructions) {
		Scanner inKey = new Scanner(System.in);
		
		//prompt user
		System.out.print(instructions);
		String input = inKey.nextLine();
		
		return input;
	}
	
	
	
	
	public static boolean letterCheck(char letter, char key) {
		if (letter == key) {
			return true;
		}
		return false;
	}
	
	
	public static int countLetter(String input, char key) {
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (letterCheck(input.charAt(i), key)) {
				count++;
			}
		}
		
		return count;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		String in1 = getString("Enter dog's first name: ");
		String in2 = getString("How old is your front toe: ");
		String in3 = getString("How much would you pay me to sell you as a cheesecake? ");
		
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		
		
		int count = countLetter("blueberry", 'e');
		System.out.println(count);
		
		
		
		
	}
	
	
	
	
}
