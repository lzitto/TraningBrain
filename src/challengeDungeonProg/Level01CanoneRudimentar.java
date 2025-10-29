package challengeDungeonProg;
import java.util.Scanner;

/*
 * aqui teremos algumas implementações sobre o exercicio
 * primeiro vamos declarar entradas de dados com tipos primitos
 * para isso tempos alguns casos como:
 * int numero = sc.nextInt();  // lê um número inteiro
 * double valor = sc.nextDouble();
 * String linha = sc.nextLine();
 * sc.nextLine();  // consome o \n pendente
 * com isso temos agora uma bela base pra entrada de dados
 */

/*   >> ABRINDO O GRANDE ASPAS """"; sobre o que se trata essa linha de pensamento que tenho
 - como mapa de lembrete de um viajante que armazena em uma vida o que lhe foi vivido, e ao recomeçar, lembra-te de 
 todos os teus habitos praticos e bons.
*/

public class Level01CanoneRudimentar {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  // cria o scanner, utilizamos isso pra dizer que em java vou dar uma entrada via teclado
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a + b;

        System.out.println("X = " + x);
    }    
}


// Eita, lvl 01 foi concluido con sucesso.
// recomepnsas são o conhecimento e o retorno disso é diversão continua, essa que trará prosperidade, alegria, abundância e riqueza