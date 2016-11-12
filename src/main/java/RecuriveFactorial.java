/**
 * Created by peter on 11/4/16.
 */
public class RecuriveFactorial {

    public long factorial(long n){
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
