package sorting_algos;


public class MergeSort{

    public static void mergeSort(int[] array){
        long start = System.nanoTime();
        mergeSort(array, new int[array.length], 0, array.length-1);
        long end = System.nanoTime();
        System.out.println("Merge Sort completed in " + (end - start) + "ns.");
    }

    public static void mergeSort(int[] array, int[] tempArray, int leftStart, int rightEnd){
        if(leftStart >= rightEnd) return ;
        int middle = (leftStart + rightEnd)/2; //Find the middle point
        mergeSort(array, tempArray, leftStart, middle); //MergeSort the left side
        mergeSort(array, tempArray,(middle+1), rightEnd); //MergeSort the left side
        mergeHalves(array, tempArray,leftStart, rightEnd); //Merge both halves
    }

    private static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while(left <= leftEnd && right <= rightEnd){
            if(array[left] <= array[right]){
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        System.arraycopy(array, left, temp, index, leftEnd-left+1);
        System.arraycopy(array, right, temp, index, rightEnd-right+1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }
}
