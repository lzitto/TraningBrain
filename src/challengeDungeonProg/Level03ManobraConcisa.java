package challengeDungeonProg;
import java.util.Scanner;

public class Level03ManobraConcisa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  // cria o scanner, utilizamos isso pra dizer que em java vou dar uma entrada via teclado

        int a = sc.nextInt();
        int b = sc.nextInt();
        int SOMA = a + b;

        System.out.println("SOMA = " + SOMA);

    }
}
