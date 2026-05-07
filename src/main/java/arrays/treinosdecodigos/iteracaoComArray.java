import java.util.Scanner;

public class iteracaoComArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // cria o scanner, utilizamos isso pra dizer que em java vou dar uma entrada via teclado

        int[] listaDeNum = {1,2,3,4,5,6,7};
        int n = 3;
        //verifica se existe um n dentro do array

        for (int i=0;i<listaDeNum.length;i++) {
            if (listaDeNum[i] == n) {
                System.out.println("encontramos : " + "" + n);
            }
            else {
                System.out.println("Não existe");
            }
        }
    }
}
