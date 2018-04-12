package sorting_algos;

import java.util.Arrays;

public class SortingController {

    //Change in order to print arrays into console. Not recommended with huge arrays.
    static boolean printArrays = false;
    public static void main(String[] args) {
        int[] array = generateRandomIntArray(5000);
        if(printArrays) System.out.println("Unsorted array: " + Arrays.toString(array));
        useBubbleSort(array.clone());
        useMergeSort(array.clone());
        useInsertionSort(array.clone());
        useExchangeSort(array.clone());
        useSelectionSort(array.clone());

    }
    public static int[] generateRandomIntArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < size-1; i++)
            array[i] = (int)(Math.random() * (size*3));

        return array;
    }
    public static void useMergeSort(int[] array){
        System.out.println("Merge Sort:");
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array);
        if(printArrays) System.out.println("Sorted array:   " + Arrays.toString(array));
        System.out.println("----------------------------------------------------");
    }
    public static void useBubbleSort(int[] array){
        System.out.println("Bubble Sort:");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(array);
        if(printArrays) System.out.println("Sorted array:   " + Arrays.toString(array));
        System.out.println("----------------------------------------------------");
    }
    public static void useExchangeSort(int[] array){
        System.out.println("Exchange Sort:");
        ExchangeSort exchangeSort = new ExchangeSort();
        exchangeSort.exchangeSort(array);
        if(printArrays) System.out.println("Sorted array:   " + Arrays.toString(array));
        System.out.println("----------------------------------------------------");
    }
    public static void useInsertionSort(int[] array){
        System.out.println("Insertion Sort:");
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(array);
        if(printArrays) System.out.println("Sorted array:   " + Arrays.toString(array));
        System.out.println("----------------------------------------------------");
    }
    public static void useSelectionSort(int[] array){
        System.out.println("Selection Sort:");
        SelectionSort selectionSort = new SelectionSort();
        SelectionSort.selectionSort(array);
        if(printArrays) System.out.println("Sorted array:   " + Arrays.toString(array));
        System.out.println("----------------------------------------------------");
    }

}
