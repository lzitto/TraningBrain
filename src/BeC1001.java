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
public class BeC1001 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  // cria o scanner, utilizamos isso pra dizer que em java vou dar uma entrada via teclado

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a + b;

        System.out.println("X = " + x);

    }
}
