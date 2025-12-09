import java.util.Scanner;

public interface BeC1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ok");

        int num = sc.nextInt();

        int horas = num / 3600;
        int resto = num % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);


    
    }
}
