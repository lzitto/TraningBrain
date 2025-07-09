import java.util.Scanner;

public class BeC1005 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  // cria o scanner, utilizamos isso pra dizer que em java vou dar uma entrada via teclado

        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();
        double media = ((notaA * 3.5) + (notaB * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n" ,  media);

    }
}
