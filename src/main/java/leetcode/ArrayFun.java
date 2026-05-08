package leetcode;

public class ArrayFun {

    public static void visualizarArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("X[" + i + "] = " + v[i]);
        }
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

     public static void bubbleSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }
}