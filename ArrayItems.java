import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ArrayItems {


    // 1find duplicate number on Integer array in Java, -- brute force and hashSet ways
    public void FindDuplicate( int[] items)  {
        //put it to hashSet
        HashSet hs = new HashSet();

        for ( int index=0; index < items.length; index++) {

            if (  hs.add( items[index] ) == false) {
                System.out.println("ArrayItems.FindDuplicate: " + items[index] );
            }
            else {
                System.out.println("ArrayItems.NonDuplicate: " + items[index] );
            }
        }
        //Time Complexity = O(n) because you are only going through array one time, but it also has space complexity of O(n)
        //because of HashSet data structure, which contains your unique elements. So if an array contains 1 million elements,
        //in worst case you would need an HashSet to store those 1 million elements.

    }


    //2.program to remove duplicates from array in Java
    //Remove Duplicate integer : Sort number to bring duplicates together. get a new array and put the new result into the array using brute force
    //Remove Duplicate String:
    public void Removeduplicates( int[] items) {

        //items=Sort(items);
/*
        int[] result = new int[items.length];

        int previous = items[0];
        result[0]=previous;

        for ( int index =1; index < items.length; index++) {

            int current = items[index];

            if (current !=previous ) {
                result[index]=current;
            }

            previous=current;
        }

  */
        //++++++++++++++++++++++++++++++++++++++++++++++++Another Solution_-_-_-_-_-_---__---___----___----________----------________-----------_________----------------_____
        int[] result1 = new int[items.length];
        HashSet hs = new HashSet();
        int counter = 0;
        for ( int index=0; index < items.length; index++) {

            if (  hs.add( items[index] ) == false) {
                System.out.println("ArrayItems.FindDuplicate: " + items[index] );
            }
            else {

                result1[counter] = items[index];
                counter++;
                System.out.println("ArrayItems.NonDuplicate: " + items[index]);
              }
            }
        //Time Complexity = O(n) because you are only going through array one time, but it also has space complexity of O(n)
        //because of HashSet data structure, which contains your unique elements. So if an array contains 1 million elements,
        //in worst case you would need an HashSet to store those 1 million elements.
    }


    //3.Given a string  array, put all repeated characters together.
    //repeatChars({"hello","robot","summer","elephant"}) = {"hello","summer"}
    public void RepeatTogether() {

        String[] wl = {"app","By","Hello","Cat","Summer","way"};

        String[] result = new String[wl.length];
        int counter = 0;
        for (String item : wl ) {

            char[] CharArray = item.toCharArray();

            for(int character=0; character<CharArray.length -1; character++) {

                System.out.println("character: "+CharArray[character]);

                if(CharArray[character] == CharArray[character+1]) {
                    System.out.println("repeated characters found: " +item);
                    result[counter] = item;
                    counter++;
                    break;
                }
            }
        }//time complexity is O(n2).  two for loop

        //Using ascii values and HashSet
        String[] wl1 = {"app","By","Hello","Cat","Summer","way"};
        ArrayList<String> al = new ArrayList<String>();
        Set<Integer> uniques;

        for (String word: wl1){
            uniques = new HashSet<Integer>();
            for (int i=0; i < word.length();i++){

               char h= word.charAt(i);
                int asciiVal = (int) h;

                if(uniques.add(asciiVal)) { }
                else {
                    System.out.println("word is duplicate: "+word);
                    break;
                }
            }

        }

    } //time complexity is O(n2). two for loop


    //4.Write a function that computes the intersection of two arrays.
    //The arrays are sorted. Then, what if one array is really larger than the other array?”
    //arr1[] = {1, 3, 4, 5, 7}
   // arr2[] = {2, 3, 5, 6}
    // Intersection as {3, 5}.
    public void IntersectTwoArray() {

        Integer[] Array1 = {1, 3, 4, 5, 7};
        int[] Array2 = {2, 3, 5, 6};

        Set<Integer> uniques = new HashSet<Integer>(Arrays.asList(Array1));

        for (int num : Array2) {
            if (uniques.add(num)) {
            } else {
                System.out.println(" Intersected num is: " + num);
            }
        }
        //Time  is O(N) & O(N) in space.
    }

    //reversing an array of characters without creating a new array
    public void reversearray() {

        int[] Array = {2, 3, 4, 5, 6};
        int End = Array.length-1;

        for(int Start=0; Start <Array.length/2; Start++, End--) {
            int temp = Array[Start];
            Array[Start]=  Array[End];
            Array[End] = temp;

            //Time complexity is O(n*logn)
        }
    }

    //How to find largest element in unsorted array? >>>>> use quickSelect algorithm
    public void FindKthElement(int[] array, int low, int high, int k) {

        Sorting Sort = new Sorting();
        int[] arrayResult = Sort.QuickSort(array,low,high);

        int theLargestKthElement = arrayResult[arrayResult.length -k]; // Time is O(nlog(n))

        int KthElement = Sort.QuickSelect(array,low,high,5);

    }

    //How to find smallest element in unsorted array?


    //Given two strings s and t, write a function to determine if t is an anagram of s.
    //For example,
    //s = "anagram", t = "nagaram", return true.
   // s = "rat", t = "car", return false.



    //Find all Subsets that sum upto 10. example
    //int [] arr ={1,2,3,4,5,6}
   // Subsets are :
    //        4,5,1
      //      4,6
       //     2,3,5 etc.

    //Print missing elements that lie in range 0 – 99


    //Find common elements in three sorted arrays


    //Move all zeroes to end of array


    // input array is [-1, 2, -3, 4, 5, 6, -7, 8, 9], then the output should be [9, -7, 8, -3, 5, -1, 2, 4, 6] Rearrange positive and negative numbers in O(n) time and O(1) extra space

}
