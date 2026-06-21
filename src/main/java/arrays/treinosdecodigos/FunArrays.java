package arrays.treinosdecodigos;

import java.util.Arrays;

public class FunArrays {
    public static void main(String[] args) {
    
        int[] v = {11,3,2,1,7,10,-1};
        int[] x = {4,2,3,1,5};
        
        System.out.println(Arrays.toString(v));
        System.out.println(containsInVector(v, -1));
        System.out.println(indexPos(v, 3));
        System.out.println(indexPos(x, 4));

        
        
    }
    
    public static boolean containsInVector(int[] v , int n) {
        boolean contains = false;
        for(int i = 0; i < v.length; i++) {
            if(n == v[i]) {
                contains = true;
            }
        }
        return contains;
    }

    // problema : retornar a posicao em que o elemento esta num array desordenado; 
    // ex : v = {4,2,3,1,5};    para n = 9 , retorno é nao existe. 
    // para n = 3, retorne pos 2, para n = 1 reorne pos 3 e para n = 4 pos 0 ;

    public static int indexPos(int[] v, int n) {
        int ans = -1;
    
        for(int i = 0; i < v.length;i++) {
            if(n == v[i]) {
                ans = i;
            }
        }
        return ans;
    }

}
