package beCrowdTrain;
import java.util.Scanner;

public class BeC1010 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  

        int codPeca1 = sc.nextInt();
        int numPecas1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int codPeca2 = sc.nextInt();
        int numPecas2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double valorAPagar = numPecas1 * valorPeca1 + numPecas2 * valorPeca2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , valorAPagar);
    }
}
