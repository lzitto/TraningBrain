package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArrayFunTest {

    @Test
    void testTamanhoArray() {

        int[] v = {};

        int resultado = ArrayFun.tamanhoArray(v);

        assertEquals(0, resultado);
    }
    
    @Test
    void testInverteArray(){
        int[] v = {7,6,5,3,2,1};

        int[] resultado = ArrayFun.inverteArray(v);

        int[] esperado = {1,2,3,5,6,7};
        
        assertArrayEquals(esperado, resultado);
    }

    @Test
    void testBubbleSort() {
        int[] arr = {1,2,3};
        
        ArrayFun.bubbleSort(arr, 0, 2);
        int[] esperado = {1,2,3};
        
        assertArrayEquals(esperado, arr);
    }

    @Test
    void testTrocaVetorPos() {
        int[] arr = {3,5,7,9,19,11,13,4};

        ArrayFun.trocaVetorPos(arr);
        int[] esperado = {4,13,11,19,9,7,5,3};

        assertArrayEquals(esperado, arr);

    }
}