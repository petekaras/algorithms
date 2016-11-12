import java.util.Scanner;

/**
 * Created by peter on 11/11/16.
 */
public class FibonacciLastDigit {
    public static long calc_fib(long n) {
        if(n<=1) return n;

        long[] numbers = new long[(int)n+1];
        numbers[0] = 0;
        numbers[1] = 1;

        for(int i = 2; i <= n; i++ ){
            numbers[i] = (numbers[(i-1)] + numbers[(i-2)])%10;
        }
        return numbers[(int)n];

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();

        System.out.println(calc_fib(n));
    }
}
