import java.util.Scanner;

public class prova1LEDA {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  

        int[] v =  {4,5,6,7,8,2,3,};
        
        // printaremos o array
        printArray(v);
        
        //aplicamos bubblesort e ele ordena o array fixamente.
        bubbleSort(v);

        //mostro o array ordenado de novo
        printArray(v);

    }   
    
    // método simples pra imprimir uma arrayzinho
    public static void printArray(int[] v){
        for(int i = 0; i< v.length; i++) {
            System.out.print(v[i] + " ");
        }
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


