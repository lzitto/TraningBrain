import java.util.Scanner;

public class BeC1173 {  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        arr[0] = sc.nextInt();

        for (int i = 1; i<arr.length;i++){
            arr[i] = arr[i-1] * 2;
        }

        visualizarArray(arr);
        sc.close();
    } 

    public static void visualizarArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("N[" + i + "] = " + v[i]);
        }
    }
}
