package beCrowdTrain;
import java.util.Scanner;

public class BeC1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        double x = sc.nextInt();
        double y = sc.nextInt();
        double c = sc.nextInt();
        
        int maiorAB = (x+y+abs(x,y))/2;
        // essa variavel carrega apenas o resultado esperado dos 2 primeiso valores
        /*
         * para verificar um c precisamos checar tbm.
         * 3 int de valores, e qual deles é o maior ?
         * vou pensar....
         */
        // o que diacho eu entendo por valor absoluto entre dois numeros ?
        /*
         * queria saber tambem, tipo, a = 7 e b = 11 o que é abs desses dois numeros ?
         * mas tem uma oreação atribuida a ela sabe, 
         * seria ela ( humm pensamento aleatorio, lebtmando eu agora que nao estou lendo meu livro)
         */
        
    }
    public int abs(int x, int y) {
        int resp =  x - y;
        if(resp < 0) {
            resp *= 1;
        }
        return resp;
    }
}
