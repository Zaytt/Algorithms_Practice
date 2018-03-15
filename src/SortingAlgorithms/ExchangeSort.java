package SortingAlgorithms;

import java.util.Arrays;

public class ExchangeSort {

    public void exchangeSort(int[] array){
        long start = System.nanoTime();
        int n = array.length;
        for(int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++)
                if (array[i] > array[j])
                {
                    int temp = array[i];   //swapping
                    array[i] = array[j];
                    array[j] = temp;
                }
        }
        long end = System.nanoTime();
        System.out.println("Exchange Sort completed in " + (end - start) + "ns.");
    }
}
