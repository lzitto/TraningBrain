package controleFinanceiroTibia;
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
        double k = 10500.00;
        double real = 51.00;
        double timeGamePlay = sc.nextDouble();
        double imbui = (150.00 * timeGamePlay)/60;
        double profit = sc.nextDouble()- imbui;
        System.out.printf("var1: %.2f\n" + "var2: %.1f\n" + "var3: %.1f\n", k,real,profit);
        
        double profitRealLiq = ((profit-imbui) * real) / k;
        System.out.printf("profitLiquidoReal: %.1f $$", profitRealLiq);
    }
}
