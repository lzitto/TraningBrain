import java.util.Scanner;

public class convertKKinReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // informações necessarias para o codigo
        /*
        preco do tc ta 42259 k cada unidade
        o site ta pagando 54,65 por 250 com taxa fixa de 4 reais por transição
        esse ainda eh o q melhor paga e tbm o que demora + a pagar, talvez ...
    
        */
        System.out.println("Insira quantos TC venderá: ");
        double quantTc = sc.nextDouble();
        System.out.println("Preco de 250 TC: ");
        double precoTc = sc.nextDouble();
        System.out.println("--------------------------------------");
        double valorReceber = ((quantTc/250) * precoTc);
        System.out.printf("Valor total a receber da venda: %.2f\n", valorReceber);
    
    }    
}
