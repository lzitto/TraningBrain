package beCrowdTrain;
import java.util.Scanner;
/*
 * o legal é que posso usar isso como fonte de desabafo né, caralho vei porque as coisas tem que ser desse jeito ??
 * a culpa é minha vei, sempre,, porque diachos ?! DEUS!!! DO CEUS! ;()
 * Tudo bem temos trabalho a fazer, não posso fazer nada vei, eu tentei acordar ela de forma carinhosa, e não brutal
 * tirando pano do rosto, até isso fiz com delicadesa e conversamos vei... MAS PORQUE DIABOS ACONTECEU ISSO MEU DEUS!???
 * A vei, vou focar em qualquer coisa, o tempo cura qualquer ferida, e meus corpos aqui andam meio turvos demais....
 */
public class BeC1041 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        

        /* Essa não é a solução ideal apesar dela resolver o problema
         * Porque ? não é boa pratica usar multiplos If's isso pode acabar envolvendo impressão errada
         * o que fazer ? vamos tentar por as saidas de forma de variaveis
         */
        
        String coordenada; // aqui vou usar essa variavel para imprimir

        if (x==0 && y==0) {
            coordenada = "Origem";
        } else if (x==0) {
            coordenada = "Eixo Y";
        } else if (y==0) {
            coordenada = "Eixo X";
        } else if (x>0 && y>0) {
            coordenada = "Q1";
        } else if (x>0 && y<0) {
            coordenada = "Q4";
        } else if (x<0 && y<0) {
            coordenada = "Q3";
        } else {
            coordenada = "Q2";
        }
        

        System.out.println(coordenada);

        sc.close();
    }
}
