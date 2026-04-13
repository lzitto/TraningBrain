import java.util.Scanner;

public class DataType2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i;
        double d;
        String s;

        i =  sc.nextInt();
        d =  sc.nextDouble();
        sc.nextLine();
        s = sc.nextLine();      
        
        System.out.println(i + " :: " + d +"::"+ s);

        
    }    
}
