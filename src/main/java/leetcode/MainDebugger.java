package leetcode;

import java.util.Arrays;

public class MainDebugger {

    public static void main(String[] args) {

        int[] arr = { 3, 2, 6, 8, 1 };
        System.out.println(Arrays.toString(arr));
        leetcode.ArrayFun.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
