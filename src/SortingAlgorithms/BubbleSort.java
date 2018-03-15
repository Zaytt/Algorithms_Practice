package SortingAlgorithms;

public class BubbleSort {

    public void bubbleSort(int[] array){
        long start = System.nanoTime();
        int n = array.length;
        for(int i = 0; i < n; i++)
            for (int j = 0; j < n -i -1; j++)
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
         long end = System.nanoTime();
        System.out.println("Bubble Sort completed in " + (end - start) + "ns.");
    }
}
