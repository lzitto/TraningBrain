package magicBackpack;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Backpack NEW 2");

        Item sword = new Item("Sanguine Razor", 300000, 3);
        Item arm = new Item("Spirtthorn Armor", 220000, 7);
        Item legs = new Item("Falcon Legs", 60000,5);

        System.out.println(sword);
        System.out.println(arm);
        System.out.println(legs);

        System.out.println(sword.getNome()); 
        System.out.println(arm.getValor());
        System.out.println(legs.getNome());
        System.out.println(sword.getCod());
        
        sword.setNome("NewBis Sword COmming!!");
        sword.setValor(1000000);

        System.out.println(sword);

        Item swordNew = sword;
        System.out.println(swordNew);
        sword.setNome("Grand Sanguine Razor");
        sword.setValor(0001);

        System.out.println(sword);
      
        // ------- Agora vamos ver essa bp saindo do forno

        Backpack bookBackpack = new Backpack();
        
        System.out.println((bookBackpack));
        bookBackpack.insertAt(1, sword);
        bookBackpack.insertAt(3, legs);
        bookBackpack.insertAt(0, sword);
        bookBackpack.insertAt(0, arm);
        
        System.out.println((bookBackpack));


        
        
    }   
}
