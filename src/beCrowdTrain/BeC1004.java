package beCrowdTrain;
import java.util.Scanner;

public class BeC1004 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  // cria o scanner, utilizamos isso pra dizer que em java vou dar uma entrada via teclado

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double PROD = a * b;

        System.out.println("PROD = " + PROD);

    }
}
