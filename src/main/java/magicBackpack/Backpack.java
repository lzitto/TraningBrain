package magicBackpack;

import java.util.Arrays;

public class Backpack {
    private Item[] array;
    private int size;

    public Backpack() {
        array = new Item[10];
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
    sb.append("Mochila [Itens: ").append(size).append("] -> ");
    for (int i = 0; i < size; i++) {
        if (array[i] != null) {
            sb.append("[").append(i).append(": ").append(array[i].getNome()).append("] ");
        } else {
            sb.append("[").append(i).append(": BURAGO/NULL] "); // Excelente para pegar o bug que discutimos antes!
        }
    }
    return sb.toString();
    }

    public void insertAt(int index, Item item) {
        // shift para direita para inserir 
        // arr[0,0,0,0] se quero inserir numa posição, preciso afastar a partir 
        // daquela posição
        // se quero adicionar no index 3, entao i tem que ser 
        for(int i = size-1; i >= index;i--) {
            array[i+1] = array[i];
        }
        array[index] = item;
        size++;
    }

    public void removeAt(int index, Item item) {
 
    }
}
