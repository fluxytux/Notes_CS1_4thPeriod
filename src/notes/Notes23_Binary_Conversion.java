package notes;

import java.util.Scanner;

public class Notes23_Binary_Conversion {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter an integer < 256: ");
		int input = inKey.nextInt();
		int storeInput = input;
		
		String str = "";  // to hold my binary String
		
		//loop from 7 to 0
		for (int i = 7; i >= 0; i--) {
			
			//can I divide out the 2?
			if (input / (int) Math.pow(2, i) > 0) {
				str += "1";
				input -= (int) Math.pow(2, i);
			}
			else {
				str += "0";
			}
			
		}
		
		
		System.out.println(storeInput + " in binary: " + str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
