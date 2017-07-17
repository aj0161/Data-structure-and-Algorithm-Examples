import javax.lang.model.element.VariableElement;
import javax.xml.bind.ValidationEvent;

public class SingleLinkedList {
	
	private Node head;
	
	public SingleLinkedList() {
		
		//Need to pointed to zero 
		head= null;
	}
	
	public void Insert(String thedata) {
		
		Node FirstLink = new Node();
		
		//Insert to the first Unit
		if(head == null) {
			FirstLink.Data = thedata;
			FirstLink.Next = null;
			
			head=FirstLink;
		}
		else {
			//Insert in the Last
			
			//Create counter
			Node CurrentLink = head;
			
			//traverse through a node
			while(CurrentLink != null) {
				
				//if a next node is null, add a new node and value
				if(CurrentLink.Next == null)
				{
					CurrentLink.Next = new Node();
					CurrentLink.Next.Data = thedata;
					CurrentLink.Next.Next = null;
					break;
				}
				//move to next node
				CurrentLink = CurrentLink.Next;
			}
		}
 	}
	
	//insert in nth element
	
	//Traverse the list and find the length of list
	//After finding length, again traverse the list and locate n/2 element from head of linkedlist.
	public void InsertMiddle(String thedata) {
		Node FullRun = head;
		Node HalfRun = head;
		
		int counter = 0;
		int halflength = 0;
		
		//traverse through a node
		while(FullRun != null) {
			counter++;
			
			//get to half run
			if(counter % 2 == 0) {
				halflength++;
				
				if((counter/2 == halflength) && (FullRun.Next == null))  {
					//insert the data
					HalfRun.Data = thedata;
					break; 
				}
				HalfRun = HalfRun.Next;
			}
			//move to next node
			FullRun = FullRun.Next;
		}
	}
	
	
	//Find nth element from end of linked list
	public void FindNth(int n) {
		
		Node Firstrun = head;
		Node NthRun = head;
		
		for (int i = 0; i < n; i++) {
			Firstrun = Firstrun.Next;
		}
		
		while (Firstrun != null) {
			NthRun = NthRun.Next;
			Firstrun = Firstrun.Next;
		}
		
		System.out.println("The n is " + n + "and the value is " + NthRun.Data);
	}


	//reverse the linked list
	public void Reverse() {
		//Iterative
		Node PreviousNode = null;
		Node NextNode;
		Node CurrentNode= head;

		while (CurrentNode != null) {
			
			NextNode = CurrentNode.Next;
			
			CurrentNode.Next = PreviousNode;
			
			PreviousNode = CurrentNode;
			//Move to the next node
			CurrentNode = NextNode;
		}
		Display(PreviousNode);
	}
	
	
	public void Display(Node item) {
		while (item != null) {
			System.out.println(item.Data);
			item = item.Next;
		}
	}

}

class Node {
	
	String Data;
	Node Next;
	
	public Node()
	{}
	
	public Node(String theData)
	{
		this.Data = theData;
	}
}