<<<<<<< HEAD
=======

>>>>>>> f36b591 (LabLCC2: new idiea)
package controleFinanceiroTibia;
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

        double wastTotal = 300.00;
        double precoKK = 10500.00;
        double precoTC = 50.00;

        //Entradas de dados
        System.out.println(":: Digite quantos minutos você caçou >> ");
        int seasson =  sc.nextInt();
        System.out.println(":: Digite quantos de profit você fez >> ");
        int balance = sc.nextInt();
        
        //Operacoes ou metodos pra usar
        double custoImb = ((wastTotal * seasson)/60);
        double profitHunt = ((balance - custoImb ) * precoTC)/precoKK;

        // o que quero é setar um valor tempo fixo, logo o imbui tbm é fixo pra essa entrada
        // então ... papel e caneta!

        // o que quero aqui é um novo metodo que de pra mim o seguinte
        // se 40 min = 1345  então qaunto seria em 60 min  ? simples. faço pra 40 - 1345 __ 60 - x.

    
        System.out.println(":: Se fosse 1 hora completa nessa progressão -> ? x");
    
        //Impressoes do que está aconecendo 
    
        System.out.printf("Valor feito em $$ Total da huntUnitaria: %.2f\n", profitHunt); 

        sc.close();
    }
}

