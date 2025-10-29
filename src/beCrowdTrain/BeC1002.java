package beCrowdTrain;
import java.util.Scanner;
/*
 * 
 */
public class BeC1002 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  // cria o scanner, utilizamos isso pra dizer que em java vou dar uma entrada via teclad

        double n = 3.14159;
        double raio = sc.nextDouble();
        double area = n * (raio * raio);

        System.out.printf("A=%.4f\n " , area);

    }
}
