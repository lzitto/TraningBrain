package arrays;
class MyArrayList {

    private int[] array;
    private int size;

    public MyArrayList() {
        array = new int[10];
        size = 0;
    }

    public void insertAt(int index, int value) {

        // Shift para direita
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }

        array[index] = value;
        size++;
    }

    public int removeAt(int index) {

        int removed = array[index];

        // Shift para esquerda
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;

        return removed;
    }

    public int search(int value) {

        for (int i = 0; i < size; i++) {

            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    public int searchAt(int index) {
        return array[index];
    }

    public int getSize() {
        return size;
    }
}

public class Main {

    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();

        // Inserções
        list.insertAt(0, 10);
        list.insertAt(1, 20);
        list.insertAt(2, 30);
        list.insertAt(3, 40);

        System.out.println("Array inicial:");
        printList(list);

        // Inserindo no meio
        list.insertAt(1, 99);

        System.out.println("\nDepois de inserir 99 no índice 1:");
        printList(list);

        // Removendo
        int removed = list.removeAt(2);

        System.out.println("\nElemento removido: " + removed);

        System.out.println("\nDepois da remoção:");
        printList(list);

        // Busca
        int index = list.search(40);
        System.out.println("\n40 encontrado no índice: " + index);

        // Busca por índice
        int value = list.searchAt(1);
        System.out.println("Valor no índice 1: " + value);
    }

    public static void printList(MyArrayList list) {

        System.out.print("[ ");

        for (int i = 0; i < list.getSize(); i++) {
            System.out.print(list.searchAt(i) + " ");
        }

        System.out.println("]");
    }
}