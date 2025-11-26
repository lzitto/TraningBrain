import java.util.Scanner;

public class BeC1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        //double c = sc.nextInt();
        
        int maiorAB = (x+y+abs(x,y))/2;
        int maiorABC = (maiorAB+z+abs(maiorAB, z))/2;
        
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

        //esse print é só ptra testar a função
        //System.out.println(abs(x,y));  

        System.out.println(maiorABC + " eh o maior");                   
    }

    // criação da função abs feita com sucesso, creio eu...pelos meus testes
    public static int abs(int x, int y){
        int resp = x - y;
        if(resp < 0) {
            resp *= -1;
        }
        return resp;
    }  
}
