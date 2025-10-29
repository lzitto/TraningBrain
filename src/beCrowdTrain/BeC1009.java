package beCrowdTrain;
import java.util.Scanner;

public class BeC1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        String vendedor = sc.nextLine();
        double salario = sc.nextDouble();
        double vendas = sc.nextDouble();
        
        double percentualVendas = vendas * 0.15;
        
        double total = salario + percentualVendas;
    

        System.out.printf("TOTAL = R$ %.2f\n" , total);

    }
}
