import java.util.*;

public class GCD {


    public static long calc(long a,long b) {
        long result = a % b;
        if(result==0)return b;
        return calc(b,result);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(calc(a, b));
    }
}
