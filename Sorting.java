import java.util.Optional;
import java.util.Random;
import java.util.function.Function;


public class Sorting {

        //worst case: o(n2) very rare only when pivot lies either on least or highest element. Otherwise, its O(n log n)
        public int[] QuickSort(int[] arr, int low, int high) {

            if (arr == null || arr.length == 0)
                return null;

            if (low >= high)
                return null;

            // pick the pivot
            int middle = low + (high - low) / 2;
            int pivot = arr[middle];

            // make left < pivot and right > pivot
            int i = low, j = high;
            while (i <= j) {

                //loop through until you find an element less than the pivot.
                while (arr[i] < pivot) {
                    i++;
                }

                //loop through until you find an element greater than the pivot
                while (arr[j] > pivot) {
                    j--;
                }

                if (i <= j) {
                    //swapping
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j]=temp;
                    //move index to next location
                    i++;
                    j--;
                }
            }

            // recursively sort two sub parts
            if (low < j)
                QuickSort(arr, low, j);

            if (high > i)
            {
                QuickSort(arr, i, high);
            }

            return arr;
        }



    //Time Complexity: average = O(n); worse O(n^2)
    public int QuickSelect(int[] array, int low, int high, int k ) {

        if(array.length == 0) {
            return -1;
        }

        if(low > high) {
            return -1;
        }

        int middle = low + (high - low) / 2;
        int i = 0;

        int pivot = array[middle];

        while( i <= high ) {

            int newPivot = Partition( array, low, high, k);
            i++;
            if(newPivot  == k )
                return array[newPivot];
        }


    }

    private static void Swap(int[] array, int i, int j) {
        int temp = i;
        i =array[j];
        array[j]=temp;
    }

    private static int Partition(int[] array, int low, int high, int k) {

        int middle = low + (high - low) / 2;
        int left = low, right=high;

        int pivot = array[middle];

        while(left <= high) {

            //loop through the array until the values smaller than the pivot.
            while(array[left] < pivot) {
                left++;
            }

            //loop through the array until the values greater than the pivot.
            while(array[right]> pivot) {
                right++;
            }

            //swap
            if(left <= high) {
                Swap(array,left,high);
            }
        }
    }

}
