/**
 * Created by peter on 11/4/16.
 */
public class Factorial {

    public long factorial(long n){
        long result = n;
        for(long i=n-1;i!=0;i--){
            result = i * result;
        }
        return result;
    }

}
