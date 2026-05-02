import java.util.Scanner;

public class BeC1172 {  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if ( arr[i] <= 0) {
                arr[i]= 1;
            }
        }

        visualizarArray(arr);
        sc.close();
    }

    public static void visualizarArray(int[] v) {
        for (int i=0; i<v.length; i++) {
            System.out.println("X[" + i + "]" + " = " + v[i]);
        }
    }
}
