package beCrowdTrain;
import java.util.Scanner;

public class BeC1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        double pi = 3.14159;
        double raio = sc.nextDouble();
        double volumeEsfera = ((4/3.0) * pi * (raio * raio * raio))3;

        System.out.printf("VOLUME = R$ %.3f\n" , volumeEsfera);

    }
}
