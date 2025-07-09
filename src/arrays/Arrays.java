


public class Arrays {
    public static void main(String[] args) {
        System.out.println("----------------------Criando Um Array com 3 elementos-----------------------");

        int[] ArrayDeInt = new int[5]; // cria um array com 5 elementos, todos com valor 0 padrão de init de inteiros

        System.out.println(ArrayDeInt);

        // vamos percorrer esse array por indice dele pra poder imprimir seus elementos
        for (int i = 0; i <= ArrayDeInt.length; i++) {
            System.err.println(ArrayDeInt[i]);
        }
    }
}
