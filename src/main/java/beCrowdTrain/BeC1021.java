import java.util.Locale;
import java.util.Scanner;


public class BeC1021 {  
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        int notas = (int) n;
        double y = (n % (int) n) *100;
        int moedas = (int) y;

        System.out.printf("N: %.2f\n", n);
        System.out.println("inteiro Notas: " + notas);
        System.out.println("Inteiro centavos: " + moedas);
        System.out.println(notas + " : " + moedas);
        
        int notaDe100 = notas / 100;
        n = n % 100;
        System.out.println(notaDe100 + " nota(s) de R$ 100,00");
        int notaDe50 = (int) n / 50;
        n = n % 50;
        System.out.println(notaDe50 + " nota(s) de R$ 50,00");
        int notaDe20 = (int) n / 20;
        n = n % 20;
        System.out.println(notaDe20 + " nota(s) de R$ 20,00");
        int notaDe10 = (int) n / 10;
        n = n % 10;
        System.out.println(notaDe10 + " nota(s) de R$ 10,00");
        int notaDe5 = (int) n / 5;
        n = n % 5;
        System.out.println(notaDe5 + " nota(s) de R$ 5,00");
        int notaDe2 = (int) n / 2;
        n = n % 2;
        System.out.println(notaDe2 + " nota(s) de R$ 2,00");
        int notaDe1 =(int) n / 1;
        n = n % 1;
        System.out.println(notaDe1 + " nota(s) de R$ 1,00");

        System.out.println("-------------------------------");
        System.err.println("Moeda(s) ");
    }
}
