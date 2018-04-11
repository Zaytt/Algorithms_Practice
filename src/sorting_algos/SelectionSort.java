package sorting_algos;

public class SelectionSort {

    public static void selectionSort(int[] array){
        long start = System.nanoTime();
        for (int i = 0; i < array.length; i++)
            for (int j = i+1; j < array.length-i-1; j++){
                int min = array[i];
                if(array[j] < min){
                    min = array[j];
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        long end = System.nanoTime();
        System.out.println("Insertion Sort completed in " + (end - start) + "ns.");
    }
}
