package beCrowdTrain;
import java.util.Scanner;

public class BeC1008 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  

        int numFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorPorHora = sc.nextDouble();
        
        double salarioRecebido = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf("SALARY = U$ %.2f\n" , salarioRecebido);
    }
}
