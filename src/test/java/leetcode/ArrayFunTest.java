package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import arrays.secretboxpapers.ChamaSoUmzin;

public class ArrayFunTest {

    @Test
    void testTamanhoArray() {
        int[] v = {};
        int resultado = ArrayFun.tamanhoArray(v);
        assertEquals(0, resultado);
    }

    @Test
    void testInverteArray() {
        int[] v = { 7, 6, 5, 3, 2, 1 };
        int[] resultado = ArrayFun.inverteArray(v);
        int[] esperado = { 1, 2, 3, 5, 6, 7 };

        assertArrayEquals(esperado, resultado);
    }

    @Test
    void testBubbleSort() {
        int[] arr = { 1, 2, 3 };

        ArrayFun.bubbleSort(arr, 0, 2);
        int[] esperado = { 1, 2, 3 };

        assertArrayEquals(esperado, arr);
    }

    @Test
    void testTrocaVetorPos() {
        int[] arr = { 3, 5, 7, 9, 19, 11, 13, 4 };

        ArrayFun.trocaVetorPos(arr);
        int[] esperado = { 4, 13, 11, 19, 9, 7, 5, 3 };

        assertArrayEquals(esperado, arr);

    }

    @Test
    void bubbleSortTest() {
        int[] v = { 5, 4, 3, 2, 1 };
        int[] resultado = { 1, 2, 3, 4, 5 };
        ArrayFun.bubbleSort(v);
        assertArrayEquals(resultado, v);
    }

    @Test

    void testSoma() {
        int i = -2;
        int k = 11;

        int result = arrays.secretboxpapers.DlzittoPlayground.somaValores(i, k);

        assertEquals(9, result);
        // assertEquals(10, result); // teste propositalmente dando errado

    }

    @Test
    void testFibonacciCasosBase() {
        assertEquals(0, arrays.secretboxpapers.DlzittoPlayground.Fibonnaci(0));
        assertEquals(1, arrays.secretboxpapers.DlzittoPlayground.Fibonnaci(1));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 1",
            "3, 2",
            "4, 3",
            "5, 5",
            "6, 8",
            "7, 13",
            "9, 34",
            "13, 233",
            "21, 10946"
    })
    void testFibonacciVariosValores(int entrada, int esperado) {
        assertEquals(esperado, arrays.secretboxpapers.DlzittoPlayground.Fibonnaci(entrada));
    }

    @Test
    void testFibonacciCasosBaseRec() {
        assertEquals(0, arrays.secretboxpapers.DlzittoPlayground.Fibonnaci(0));
        assertEquals(1, arrays.secretboxpapers.DlzittoPlayground.Fibonnaci(1));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 1",
            "3, 2",
            "4, 3",
            "5, 5",
            "6, 8",
            "7, 13",
            "9, 34",
            "13, 233",
            "21, 10946"
    })
    void testFibRecursivo(int entrada, int esperado) {
        assertEquals(esperado, arrays.secretboxpapers.DlzittoPlayground.fibRecursivo(entrada));
    }

    @ParameterizedTest
    @CsvSource({
            "20, 15, 5",
            "10, 5, 5",
            "8, 12, 4",
            "7, 3, 1",
            "100, 25, 25",
            "0, 5, 5",
            "5, 0, 5",
            "9, 9, 9",
            "1, 99, 1"
    })
    void testMDC(int a, int b, int esperado) {

        int resultado = arrays.secretboxpapers.DlzittoPlayground.mdc(a, b);

        assertEquals(esperado, resultado);
    }

    @ParameterizedTest
    @CsvSource({
        "1, 0",
        "2, 3",
        "3, 5",
        "4, 6",
        "5, 9",
        "6, 10"
    })

    void testCountLessRepetidos(int entrada, int esperado) {

    Integer[] v = {1,1,1,2,2,3,4,4,4,5};

    assertEquals(
        esperado,
        ChamaSoUmzin.countLess(v, entrada)
    );
}

    @Test
    void testeBrutoBScountLess() {
        Integer entrada = 8;
        Integer esperado = 12;
        Integer[] m = {1,2,2,2,3,3,4,4,5};
        Integer[] t = {2,4,5,7,7,7,7,7,7,7,7,7,8,10,12,14,16,18};

        assertEquals(esperado, ChamaSoUmzin.countLess(t, entrada));
    }
}
