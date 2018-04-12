package sorting_algos;

public class SelectionSort {

    public static void selectionSort(int[] array){
        long start = System.nanoTime();

        int n = array.length;

        //Loop through every element in the array but the last
        for (int i = 0; i < n -1 ; i++) {

            int min_index = i;

            //Loop through every non sorted element in the list
            for (int j = i + 1; j < n; j++) {

                //Check if the current element is less than the value at the min index
                if(array[j] < array[min_index])
                    //Set min index to the current index
                    min_index = j;
            }
            //Swap the elements
            int temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;

        }
        long end = System.nanoTime();
        System.out.println("Insertion Sort completed in " + (end - start) + "ns.");
    }
}
