
import java.util.Scanner;

public class fluxoDeControle {

    public static void main(String[] args) {
        System.out.println("::--->> Controle de flutuação e transmutação de dinhero <<---::");
        Scanner sc = new Scanner(System.in);
    
        // variaveis constantes para tempo de execução
        double imb = 143.00;
        double precoKK = 10770.00;
        double precoTC = 50.00;

        //Entradas de dados
        int seasson =  sc.nextInt();
        int balance = sc.nextInt();
        
        //Operacoes ou metodos pra usar
        double custoImb = ((imb * seasson)/60);
        double profitHunt = ((balance - custoImb ) * precoTC)/precoKK; 
    
        //Impressoes do que está aconecendo 
        System.out.printf("Gasto do imbui: %.2f\n", custoImb);
        System.out.printf("Valor feito em $$ Total da huntUnitaria: %.2f\n", profitHunt); 

        sc.close();
    }
}

