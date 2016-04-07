import javax.lang.model.element.NestingKind;

public class Link {

    public static void main(String[] args) {


        Sorting sortingmethod = new Sorting();
        int[] array = {24,2,45,20,56,75,2,56,99,53,12};


        BST.addNode(1,"first");
        BST.addNode(2,"second");
        BST.addNode(3,"Third");
        BST.addNode(0,"Zero");

        int [] myArray1 = {1,2,3,4,5,6,7,8,2,1,9};

        ArrayItems myArrayItems = new ArrayItems();
        int lowerBound=0;
        int higherBound=array.length -1;
        int findKthLargestElement = 6;
        myArrayItems.FindKthElement(array, lowerBound, higherBound,findKthLargestElement);

        myArrayItems. FindDuplicate(myArray1);
        myArrayItems.Removeduplicates(myArray1);

        myArrayItems.RepeatTogether();

        myArrayItems. IntersectTwoArray();
        myArrayItems.reversearray();

                LinkedList List = new LinkedList();
        List.InsertFirst(0);
        List.InsertFirst(-1);
        List.InsertFirst(-2);
        List.InsertFirst(-3);
        List.InsertFirst(-4);
        List.InsertLast(1);
        List.DeleteLast();
        List.InsertMiddle(222222);

    }
}

class Node  {

    int data=9999;
    Node Next;
}

class LinkedList {

     Node Head;

    //Insertion at the beginning of the Singly linked lists
    public   void  InsertFirst(int val) {

        //check if the head is null
        if ( Head == null) {
            Head = new Node();
            Head.data = val;
            Head.Next = null;
        }
        else {
            Node CurrentLink = new Node();
            CurrentLink.data = val;
            CurrentLink.Next  = Head;
            Head = CurrentLink;

        }

    }


    //Insert in the last
    public void InsertLast(int val) {

        //put it in first node if linked list is null
        if(Head == null) {
            Head = new Node();
            Head.data = val;
            Head.Next= null;
        }
        else {

            Node CurrentLink = Head;

            while (CurrentLink.Next != null) {
                    CurrentLink = CurrentLink.Next;
            }

            CurrentLink.Next = new Node();
            CurrentLink.Next.data = val;
            CurrentLink.Next.Next = null;
        }
    }


    public void DeleteLast() {
        if(Head == null) {
          return;
        }
        
        else {

            Node CurrentLink = Head;

            while (CurrentLink.Next != null) {
                CurrentLink = CurrentLink.Next;
            }


            CurrentLink.Next = null;

        }
    }

    public void InsertMiddle(int  val) {
        Node FullRun = Head;
        Node HalfRun = Head;

        int counter = 0;
        int halflength = 0;

        //traverse through a node
        while(FullRun.Next != null) {
            counter++;

            //get to half run
            if(counter % 2 == 0) {
                halflength++;

                //Increment HalfRun
                HalfRun = HalfRun.Next;
            }

                //increment FullRun
            FullRun = FullRun.Next;
        }

        if(counter/2 == halflength) {

            //insert the data
            Node newNode = new Node();
            newNode.data= val;
            newNode.Next =HalfRun.Next;

            HalfRun.Next = newNode;

        }
    }


}