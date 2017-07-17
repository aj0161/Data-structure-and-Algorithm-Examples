
public class HashTable {

	public void SimpleHashTable( String[] theArray, int TableSize) {
		String[] HashTable = new String[30];
		
		for(int i = 0; i <= theArray.length; i++) {

				int ElementToAdd = Integer.parseInt(theArray[i]) % TableSize;
				
				//Collision Check- if occurs, move to another index
				while (HashTable[ElementToAdd] != null) {
					System.out.println("Collision Try " + ElementToAdd + " Instead = "+ theArray[i]+ "There is a value in "+HashTable[ElementToAdd]);
					ElementToAdd++;
			
					//the HashTable array goes out of bound
					ElementToAdd %= arraySize;
				}
				HashTable[ElementToAdd] = theArray[i];
				System.out.println("Modulus Index= " + i + " for value "
						+ ElementToAdd);
		}
		
		System.out.println("the end");
	}
	
	int arraySize=30;
	
	public void hashFunction2(String[] stringsForArray, String[] theArray) {
		
		for (int n = 0; n < stringsForArray.length; n++) {

			String newElementVal = stringsForArray[n];

			// Create an index to store the value in by taking
			// the modulus

			int arrayIndex = Integer.parseInt(newElementVal) % 3;

			System.out.println("Modulus Index= " + arrayIndex + " for value "
					+ newElementVal);

			// Cycle through the array until we find an empty space
			
			while (theArray[arrayIndex] != null) {

				++arrayIndex;

				System.out.println("Collision Try " + arrayIndex + " Instead");

				// If we get to the end of the array go back to index 0
				arrayIndex %= arraySize;

			}

			theArray[arrayIndex] = newElementVal;

		}
		System.out.println("the end");
	}

	

	
}
