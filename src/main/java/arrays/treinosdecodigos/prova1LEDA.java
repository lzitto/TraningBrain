import java.util.Scanner;

public class prova1LEDA {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);  

        int[] v =  {4,5,6,7,8,2,3,};
        int[] x = {5,4,3,2,1};
        // printaremos o array
        printArray(v);
        System.out.println();
        //aplicamos bubblesort e ele ordena o array fixamente.
        bubbleSort(v);
         System.out.println();
        //mostro o array ordenado de novo
        printArray(v);
         System.out.println();
        // agora um novo metodo
         System.out.println();
        
        System.out.println("| Sort em voce |"); 
        printArray(x);

        sort(x, 1,4);
        System.out.println("| Agora ordenado |");
        printArray(x);

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


    public static void sort(int[] array, int leftIndex, int rightIndex) {
		if (array == null || leftIndex < 0 || rightIndex >= array.length || leftIndex >= rightIndex) {
            return;
        }

        for (int i = leftIndex; i <= rightIndex; i++) {
            for (int j = leftIndex; j < rightIndex - (i - leftIndex); j++) {        
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);  // mantém o swap
            }
        }
    
	}
}
    public static void swap(int[] array, int i, int j) {
		if (array == null)
			throw new IllegalArgumentException();

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}


