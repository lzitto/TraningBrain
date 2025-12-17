import java.util.Scanner;

public interface BeC1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double n = sc.nextDouble();

        System.out.printf("N: %.2f\n", n);

        //primeiro em notas 
        
        int notaDe100 = n / 100;
        n = n % 100;
        System.out.println(notaDe100 + " nota(s) de R$ 100,00");
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
        
        


    }
}
