package beCrowdTrain;
import java.util.Scanner;

public class BeC1017 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  

        int tempo = sc.nextInt();
        int veloc = sc.nextInt();

        double litros = tempo * veloc / 12.00;
        System.out.printf("%.3f\n", litros);

    }
}
