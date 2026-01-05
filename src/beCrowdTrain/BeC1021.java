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
    

    }
}
