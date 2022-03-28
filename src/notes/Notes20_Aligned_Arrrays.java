package notes;
/*
 * Aligned Arrays
 * 
 * 2+ arrays of the same length with paired information
 * 
 * 
 * Use aligned arrays to search through 1 type of info to 
 * find corresponding data
 * 
 */
public class Notes20_Aligned_Arrrays {

	public static void main(String[] args) {
		
		String[] names = {"Joe", "JoMamma", "Freddy2Step", "Stephanie", "Adityia"};
		int[] ages = {4, 95, 24, 15, 147};
		double[] heightFt = {8, 4.5, 2.2, 7.5, 25};
		boolean[] likesChocolate = {false, true, false, false, false};
		
		
		/*
		 * Print the names of everyone who can drive
		 */
		System.out.print("People old enough to drive: ");
		for (int i = 0; i < ages.length; i++) {
			
			if (ages[i] > 15 && ages[i] < 100) {
				System.out.print(names[i] + " ");
			}
			
			
		}
		System.out.println();
		
		
		
		/*
		 * double the height of all short people
		 */
		for (int i = 0; i < heightFt.length; i++) {
			
			if (heightFt[i] < 6) {
				heightFt[i] *= 2;
				
				String str = "no longer";
				if (heightFt[i] < 5) {
					str = "still";
				}
				
				if (likesChocolate[i]) {
					System.out.println(names[i] + ", chocolate lover, is " + str + " a shortie."
							+ "\nThey're now " + heightFt[i] + " tall.");
					
				}
				else {
					System.out.println(names[i] + ", chocolate hater (freak), is " + str + " a shortie."
							+ "\nThey're now " + heightFt[i] + " tall.");
				}
			}
			
			
			
		}
		
		
		
	}
	
	
}
