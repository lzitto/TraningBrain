package beCrowdTrain;


import java.util.Scanner;

import lib.ArrayFun;

public class BeC1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        // o desafio é: trocar indices de um array
        // para 1,2,3 troque o 1 com o 3. e pronto, se fsse 1,2,3,4,5. trocaria primeiro o 5 com 1, 4 com o 2, e o 3 permanece
        // para array par tbm , 1,2,3,4 >> 4,2,3,1 >> 4,3,2,1 . 

        int[][] array = {{1,2,3},{4,5,6}};
        for(int i = 0; i < array.length;i++ ) {
           System.out.println(array[i][j]);
           for(int j=0;j<array[i].length;j++){
            System.out.println(array[i][j]);
           }
            
            }
    }  
}       
    

