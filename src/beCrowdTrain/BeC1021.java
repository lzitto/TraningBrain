import java.util.Scanner;

public class BeC1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int x = (int) n;
        double y = (n - (int) n) *100;
        int notas = x;
        int moedas = (int) y;

        System.out.printf("N: %.2f\n", n);
        System.out.println("inteiro Notas: " + x);
        System.out.println("Inteiro centavos: " + y);
        System.out.println(notas + " : " + moedas);
        
        int notaDe100 = notas / 100;
        n = n % 100;
        System.out.println(notaDe100 + " nota(s) de R$ 100,00");
<<<<<<< HEAD
        int notaDe50 = n / 50;
        n = n % 50;
        System.out.println(notaDe50 + " nota(s) de R$ 50,00");
        int notaDe20 = n / 20;
        n = n % 20;
        System.out.println(notaDe20 + " nota(s) de R$ 20,00");
        int notaDe10 = n / 10;
        n = n % 10;
        System.out.println(notaDe10 + " nota(s) de R$ 10,00");
        int notaDe5 = n / 5;
        n = n % 5;
        System.out.println(notaDe5 + " nota(s) de R$ 5,00");
        int notaDe2 = n / 2;
        n = n % 2;
        System.out.println(notaDe2 + " nota(s) de R$ 2,00");
        int notaDe1 = n / 1;
        n = n % 1;
        System.out.println(notaDe1 + " nota(s) de R$ 1,00");
        
        sc.close();
        

=======
    
>>>>>>> dd42728fc8a573e801d7ab6f0c57a768d4c78f68

    }
}
