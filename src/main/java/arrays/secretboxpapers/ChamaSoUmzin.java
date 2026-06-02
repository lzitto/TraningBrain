package arrays.secretboxpapers;

import java.util.Arrays;

public class ChamaSoUmzin {

    public static void main(String[] args) {
     
        Integer[] v = {2,4,5,7,7,7,7,7,7,7,7,8,10,12,14,16,18};
        System.out.println(Arrays.toString(v)); 
        System.err.println(countLess(v, 10));
       

        
    }


    /*  aqui nesse danadinho eu vou chamar recursivamente minha 
    busca binaria capturando quantos menores */

    public static int countLess(Integer[] array, Integer x){
        return binarySearchLessThan(array, x,0,array.length-1);
    }
    /*e nesse bem aqui é o coração da parada, é onde vamos tratar nossa */
    public static int binarySearchLessThan(Integer[] array, Integer x, int left, int right) {
        int result;

        if (left > right) {
            result = left;
        } else {
            int mid = (left + right)/2; 
            if(array[mid] < x) {
                result = binarySearchLessThan(array, x, mid + 1, right);
            }
            else{
                result = binarySearchLessThan(array, x, left, mid -1);
            }
        }            
        return result;
    }
}