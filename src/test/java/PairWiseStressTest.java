import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/3/16.
 */
public class PairWiseStressTest {
    @Test
    public void main() throws Exception {
        int arraySize = (int)randLong(1,200000);

        long[] numbers = new long[arraySize];

        for(int i=0;i<numbers.length;i++){
            numbers[i] = randLong(0,100000);
        }
        while(true){
            long slowAnswer = PairWiseSlow.maxPairwiseProduct(numbers);
            long fastAnswer = PairWise.maxPairwiseProduct(numbers);
            if(slowAnswer != fastAnswer){
                System.out.println("FAIL: " + Arrays.toString(numbers));
                System.out.println("SLOW: " + slowAnswer);
                System.out.println("FAST: " + fastAnswer);
                break;
            }else{
                System.out.println("OK: " + Arrays.toString(numbers));
            }
        }


    }
    private static long randLong(long min, long max) {
        long value = (new java.util.Random().nextLong() % (max - min)) + min;
        if(value < 0){
            return -value;
        }
        return value;
    }

}