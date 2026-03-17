import java.util.Scanner;

public class rawVsProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int raw = 4170;
        int profit = 1392;
        int y = sc.nextInt();

        int result = profit * y / raw;
        System.out.println(result); 
    }
}
