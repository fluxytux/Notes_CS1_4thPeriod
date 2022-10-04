package notes;

import java.util.Arrays;

public class Notes21_Chars {

	public static void main(String[] args) {
		
		/*
		 * What is a char?
		 * 
		 * variable that holds only 1 character
		 * 
		 * Technically, chars are integers that print as letters
		 * 
		 */
		
		char letter = 'a';
		char letter1 = 97;
		System.out.println(letter);
		System.out.println(letter1);
		//make the 'a' a 'b'
		letter += 1;
		System.out.println(letter);
		
		
		
		
		
		
		
		
		/*
		 * Comparing chars
		 * 
		 * use ==
		 */
		if (letter == 'b') {
			System.out.println("It's a 'b'!");
		}
		
		
		
		/*
		 * Getting chars from Strings
		 * 
		 * .charAt(<index)
		 * 
		 */
		String str = "abcdefghijklmnop qrstuvwxyz";
		System.out.println(str.charAt(7));
		
		
		
		
		/*
		 * Quick char[]
		 * 
		 * <String>.toCharArray();
		 */
		char[] alphabet = str.toCharArray();
		System.out.println(Arrays.toString(alphabet));
		
		alphabet[7] = ';';
		System.out.println(Arrays.toString(alphabet));
		
		
		
		
		/*
		 * Turn char[] into a string
		 * 
		 * 
		 */
		
		String letters = String.valueOf(alphabet);
		System.out.println(letters);
		
		
		
		
		
		
		
	}
	
	
}
