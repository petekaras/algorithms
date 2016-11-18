import java.util.Scanner;

/**
 * Created by peter on 11/12/16.
 */
public class HugeFibonacci {

    public static long  calc(long a, long b) {
        return b%8;
    }




    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(calc(a, b));
    }
}
