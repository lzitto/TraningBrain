package arrays.treinosdecodigos;

public class Factorial {
    public static void main(String[] args) {
        long n = 5;

        System.out.println(factorial(n));
    }

    public static long factorial(long n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
