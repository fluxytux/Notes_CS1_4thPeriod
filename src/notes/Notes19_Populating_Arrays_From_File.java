package notes;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Notes19_Populating_Arrays_From_File {

	public static void main(String[] args) 
	throws Exception{ //needed for scanning from a file
		
		/*
		 * Scanning from File
		 * add the file name where you'd put System.in
		 * 
		 * Also, add throws Exception at the top
		 */
		Scanner inFile = new Scanner(new File("src/notes/inputNotes19.txt"));
		
		//scan the first integer 
		//in this case it's the number of elements for the arrays
		int numElements = inFile.nextInt();
		
		//Now let create the arrays
		int[] nums = new int[numElements];	
		String[] words = new String[numElements];
		double[] decs = new double[numElements];
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.toString(decs));
		
		//now populate them
		//nums
		for (int i = 0; i < numElements; i++) {
			nums[i] = inFile.nextInt();
		}
		//words
		for (int i = 0; i < words.length; i++) {
			words[i] = inFile.next();
		}
		//decs
		for (int i = 0; i < numElements; i++) {
			decs[i] = inFile.nextDouble();
		}
		
		
		System.out.println("\n" + Arrays.toString(nums));
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.toString(decs));
		
		
		
		
	}
	
	
}
