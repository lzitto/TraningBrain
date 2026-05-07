package beCrowdTrain;
import java.util.Scanner;

/*
 * quero deixar aqui que foi legal brincar com qual lado to chamadno uma variavel, 
 * nesse exercicio aprendi a transitar onde quero que a minha expressao seja impressa como resultado
 * que tal fritar o cerebro numa boa ?
 */

public class BeC1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        int x = sc.nextInt();
        double y = sc.nextDouble();
        
        double result = x/y;
        System.out.printf("%.3f km/l\n" , result);
    }
}
