import java.util.Scanner;

public class BeC1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        int anos = idade / 365;
        int resto = idade % 365;
        int mes = resto / 30;
        int resto2 = resto % 30;
        int dias = resto2;

        System.out.println(anos + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
