package arrays;

import java.util.Arrays;

/**
 * ============================================================================
 *                              LEONAM PLAYGROUND
 * ============================================================================
 *
 * Laboratório pessoal de algoritmos e estruturas de dados.
 *
 * Objetivo:
 * - testar algoritmos pequenos
 * - visualizar arrays no debugger
 * - acompanhar loops e swaps
 * - entender recursão
 * - brincar com ideias sem medo
 *
 * Filosofia:
 * "Array pequeno. Breakpoint. F10. Observar."
 *
 * ============================================================================
 */

public class LeonamPlayground {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      LZITTO PLAYGROUND");
        System.out.println("=================================");

        /*
         * TESTE 1
         * -----------------------------------------
         * Array pequeno pra visualizar algoritmo.
         */

        Integer[] array = {5, 2, 4, 1, 3};

        System.out.println("\nArray original:");
        System.out.println(Arrays.toString(array));

        bubble(array);

        System.out.println("\nArray ordenado:");
        System.out.println(Arrays.toString(array));

        /*
         * TESTE 2
         * -----------------------------------------
         * Matriz simples.
         */

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\nMatriz:");
        System.out.println(Arrays.deepToString(matriz));

        desenharMatriz(matriz);
        somaValores(2, 11);
    }

    /**
     * Bubble sort simples pra debugging.
     */
    public static void bubble(Integer[] array) {

        System.out.println("\nExecutando Bubble Sort...\n");

        for (int i = 0; i < array.length - 1; i++) {

            System.out.println("---------------------------------");
            System.out.println("PASSADA: " + i);

            for (int j = 0; j < array.length - 1 - i; j++) {

                System.out.println("\nComparando:");
                System.out.println(array[j] + " e " + array[j + 1]);

                if (array[j] > array[j + 1]) {

                    System.out.println("SWAP!");

                    swap(array, j, j + 1);

                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }

    /**
     * Troca dois elementos.
     */
    public static void swap(Integer[] array, int i, int j) {

        Integer temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Desenha matriz no terminal.
     */
    public static void desenharMatriz(int[][] matriz) {

        System.out.println("\nDesenhando matriz:\n");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public static int somaValores(int i, int k) {
        int soma = i+k;
        return soma;
    }

}