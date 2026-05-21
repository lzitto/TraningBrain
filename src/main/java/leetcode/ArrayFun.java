package leetcode;
import java.util.Arrays;
public class ArrayFun {

    public static void visualizarArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("X[" + i + "] = " + v[i]);
        }
    }
    public static void visualizarArrayClassic(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void tratarArray1172(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] <= 0) {
                v[i] = 1;
            }
        }
    }

    public static int tamanhoArray(int[] v) {
        int cont = 0;
        
        for (int i =0; i<v.length;i++) {
            cont += 1;
        }
        return cont;
    }

    public static int[] inverteArray(int[] v) {
        
        int[] ans = new int[v.length];

        for (int i = v.length -1; i >=0; i--) {
            ans[i] = v[v.length - 1 - i];
        }
        return ans;
    }
    // ---###---### ---- ### ----// ---###---### ---- ### ----// ---###---### ---- ### ----// ---###---### ---- ### ----
    public static int[] duplicaArray(int[] v) {
        int[] ans = new int[v.length*2];
        for(int i = 0; i < ans)
    }

    // -#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#
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
    
    public static void trocaVetorPos(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < arr.length/2; i++) {
            int aux = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = aux;
            n--;
        }
    }

}