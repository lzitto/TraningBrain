package beCrowdTrain;
import java.util.Scanner;

public class BeC1006 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  

        double notaA = sc.nextDouble();
        double notaB = sc.nextDouble();
        double notaC = sc.nextDouble();
        double media = ((notaA * 0.2) + (notaB * 0.3)) + ((notaC * 0.5));

        System.out.printf("MEDIA = %.1f\n" ,  media);
        // 
    }
}
