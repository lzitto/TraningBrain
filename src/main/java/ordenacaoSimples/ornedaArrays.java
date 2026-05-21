package ordenacaoSimples;

import leetcode.ArrayFun;

public class ornedaArrays {
    public static void main(String[] args) {
        
    }

    public static void bubbleSort(int[] arr, int leftInfex, int rightIndex) {
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = leftInfex; i < rightIndex; i++) {
                if(arr[i]>arr[i+1]) {
                    int aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                }
            }
        }
    }
    

}
