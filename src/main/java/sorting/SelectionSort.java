package sorting;

import java.util.Arrays;

public class SelectionSort {

    //array 4,3,6,2,7,1

    public static void swap(int i, int j, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int[] selectSort(int[] sequence) {

        for (int i = 0; i < sequence.length; i++) {
            int smallest = sequence[i];
            for (int j = i + 1; j < sequence.length; j ++) {
                if (sequence[j] < smallest) {
                    smallest = sequence[j];
                    swap(j, i, sequence);
                }
            }
        }
        return sequence;
    }


    public static void main(String[] args) {
        int[] mySeq = {9,2};
        System.out.println(Arrays.toString(selectSort(mySeq)));
    }






}
