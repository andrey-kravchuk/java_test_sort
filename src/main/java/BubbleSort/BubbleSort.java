package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    private int[] arr = {7,11,8,1,-3,-6,5,9,17,21,78,-9,-9};

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        long start = System.currentTimeMillis();

        Arrays.toString(bubbleSort.sortArray(bubbleSort.arr));

        long finish = System.currentTimeMillis() - start;
        System.out.println("Array " + Arrays.toString(bubbleSort.arr) + " sorted in " + finish + " ms");
    }

    /**
     * Sort array from min to max
     * @param inputArray
     * @return sorted int array
     */
    public int[] sortArray(int[] inputArray){
        for(int i = 0; i<inputArray.length -1; i++){
            for(int j = i; j<inputArray.length; j++){
                if (inputArray[i] > inputArray[j]){
                    replace(inputArray,i,j);
                }
            }
        }
        return inputArray;
    }


    public int[] replace(int[] result, int idx1, int idx2){

        result[idx1] = result[idx1] ^ result[idx2];
        result[idx2] = result[idx1] ^ result[idx2];
        result[idx1] = result[idx1] ^ result[idx2];

        return result;
    }
}
