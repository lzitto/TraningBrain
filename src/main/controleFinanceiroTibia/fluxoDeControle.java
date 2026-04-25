
import java.util.Scanner;
/*
esse programa segue um fluxo onde precisamos atualizar os dados sempre que vamos fazer
uma nova operacao com variaves novas.
*/

public class fluxoDeControle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("::--->> Controle de flutuação e transmutação de dinhero <<---::");
        // variaveis constantes para tempo de execução

        double wastTotal = 492.00;
        double precoKK = 10700.00;
        double precoTC = 51.00;

        //Entradas de dados
        System.out.println(":: Digite quantos minutos você caçou >> ");
        int seasson =  sc.nextInt();
        System.out.println(":: Digite quantos de profit você fez >> ");
        int balance = sc.nextInt();
        
        //Operacoes ou metodos pra usar
        double custoImb = ((wastTotal * seasson)/60);
        double profitHunt = ((balance - custoImb ) * precoTC)/precoKK; 
    
        //Impressoes do que está aconecendo 
    
        System.out.printf("Valor feito em $$ Total da huntUnitaria: %.2f\n", profitHunt); 

        sc.close();
    }
}

