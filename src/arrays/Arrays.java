package arrays;


public class Arrays {
    public static void main(String[] args) { 
        int[] arr = {12,1,5,7,8,9,4,2,11};       
        // bom, num sei, so sei que foi assim ;X
        int maior = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maior) {
                maior = arr[i];
            }
        }
        System.out.println(maior);
    }
}
