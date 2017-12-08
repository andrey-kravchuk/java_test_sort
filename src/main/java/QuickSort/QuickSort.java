package QuickSort;

import java.util.Arrays;

public class QuickSort {
    private static int[] i = {7,13,2,-9,12,11,3,5,7};


    public static void main(String[] args) {

        doSort(0, i.length - 1);
        System.out.println(Arrays.toString(i));

    }




    private static void doSort(int start, int end){


        int piv = i[start + (end - start) / 2];
        int left = start;
        int right = end;

        while (left <= right) {
            while (i[left] < piv) {
                left++;
            }
            while (i[right] > piv) {
                right--;
            }
            if (left <= right) {
                swap(i, left, right);
                left++;
                right--;
            }
        }
        if (start < right) {
            doSort(start, right);
        }
        if (end > left) {
            doSort(left, end);
        }



    }

    private static int[] swap(int[] arr, int first, int second) {
        if (first == second) {
            return arr;
        }
        arr[first] = arr[first] ^ arr[second];
        arr[second] = arr[first] ^ arr[second];
        arr[first] = arr[first] ^ arr[second];

        return arr;
    }

}
