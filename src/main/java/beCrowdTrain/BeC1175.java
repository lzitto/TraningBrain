package beCrowdTrain;
import leetcode.ArrayFun;
import java.util.Scanner;
import java.util.Arrays;

public class BeC1175 {  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int[] arr = {3,5,7,9,19,11,13,4};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int aux = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = aux;
            n--;
        }
        ArrayFun.visualizarArrayClassic(arr);
    }
}
