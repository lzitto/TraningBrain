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

    
}