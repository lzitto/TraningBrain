package beCrowdTrain;
import java.util.Scanner;

public class BeC1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double areaTriangulo = (a * c) / 2;
        
        System.out.printf("TRIANGULO: %.2f\n" , areaTriangulo);
    }
}
