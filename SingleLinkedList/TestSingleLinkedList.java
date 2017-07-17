
public class Main {

	public static void main(String[] args) {
		
		SingleLinkedList LL = new SingleLinkedList();
		LL.Insert("1");
		LL.Insert("2");
		LL.Insert("3");
		LL.Insert("4");
		LL.Insert("5");
		LL.Insert("6");
		LL.Insert("7");
		LL.Insert("8");
		LL.Insert("9");
		LL.Insert("10");
		
		LL.InsertMiddle("Middle");
		
		LL.FindNth(4);//find the 4th node from the end
		
		LL.Reverse(); //reverse linked list
		
		HashTable myHash = new HashTable();
		
		//For YouTube Example
		String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
				"235", "802", "900", "723", "699", "1", "16", "999", "890",
				"725", "998", "978", "988", "990", "989", "984", "320", "321",
				"400", "415", "450", "50", "660", "624" };
		
		String[] theArray = new String[30];
		
		myHash.hashFunction2(elementsToAdd2, theArray);
		
		
		//myHash.SimpleHashTable(elementsToAdd2,30);
		
		
	}

}
