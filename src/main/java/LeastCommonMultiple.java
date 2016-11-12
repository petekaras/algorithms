import java.util.Scanner;

/**
 * Created by peter on 11/11/16.
 */
public class LeastCommonMultiple {
    public static long  lcm(long a, long b) {

        long gcd = calc(a,b);
        return (a*b) / gcd;
    }

    private static long calc(long a,long b) {
        long result = a % b;
        if(result==0)return b;
        return calc(b,result);
    }



    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(lcm(a, b));
    }
}
