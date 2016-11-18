import java.util.Scanner;

/**
 * Created by peter on 11/18/16.
 */
public class Change {

    public static int change(int amount){
        int count = 0;
        int remainder = amount%10;

        if(remainder == 0){
            return amount / 10;
        }else{
            count = amount / 10;
            amount = amount %10;
        }

        if(amount%5 == 0){
            count = count + (amount / 5);
        }else{
            count = count + (amount / 5);
            count = count + amount %5;
        }


        return count;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(change(m));
    }
}
