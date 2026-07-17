package magicBackpack;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== METHODOS DA BACKACK =======");

        Item sword = new Item("Sanguine Razor", 300000, 3);
        Item arm = new Item("Spirtthorn Armor", 220000, 7);
        Item legs = new Item("Falcon Legs", 60000,5);
        Item shield = new Item("Glorior Shield", 321000, 7);

        Backpack bookBackpack = new Backpack();

        System.out.println((bookBackpack));
        bookBackpack.insertAt(0, sword);
        System.out.println((bookBackpack));

        bookBackpack.insertAt(1, shield);
        System.out.println((bookBackpack));

        bookBackpack.insertAt(2, legs);
        System.out.println((bookBackpack));

    
        
    }   
}
