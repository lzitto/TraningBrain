package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArrayFunTest {

    @Test
    void testTamanhoArray() {

        int[] v = {1,2,3};

        int resultado = ArrayFun.tamanhoArray(v);

        assertEquals(3, resultado);
    }

    @Test
    void testBubbleSort() {
         int[] v = {5,4,3,2,1};

         int[] resultado = {1,2,3,4,5};
         ArrayFun.bubbleSort(v);
         assertArrayEquals(resultado, v);
    }
    
}