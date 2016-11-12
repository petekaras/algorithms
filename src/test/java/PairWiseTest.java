import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/3/16.
 */
public class PairWiseTest {


    @org.junit.Test ()
    public void simple() throws Exception {
        long[] input = new long[]{1,2,4,7};
        long result = PairWise.maxPairwiseProduct(input);
        long slowResult = PairWiseSlow.maxPairwiseProduct(input);
        Assert.assertEquals(28,result);
        Assert.assertEquals(28,slowResult);
    }

    @org.junit.Test
    public void duplicates() throws Exception {
        long[] input = new long[]{1,7,4,7};
        long result = PairWise.maxPairwiseProduct(input);
        long slowResult = PairWiseSlow.maxPairwiseProduct(input);
        Assert.assertEquals(49,result);
        Assert.assertEquals(49,slowResult);
    }

    @org.junit.Test
    public void largeNumbers() throws Exception {
        long[] input = new long[]{12183926,72132138,4213,73};
        long result = PairWise.maxPairwiseProduct(input);
        long slowResult = PairWiseSlow.maxPairwiseProduct(input);
        Assert.assertEquals(878852631613788L,result);
        Assert.assertEquals(878852631613788L,slowResult);
    }
    @Test
    public void zeroNumbers() throws Exception {
        long[] input = new long[]{0,0};
        long result = PairWise.maxPairwiseProduct(input);
        long slowResult = PairWiseSlow.maxPairwiseProduct(input);
        Assert.assertEquals(0,result);
        Assert.assertEquals(0,slowResult);
    }

    @Test
    public void failcaseNumbers() throws Exception {
        long[] input = new long[]{100000,90000};
        long result = PairWise.maxPairwiseProduct(input);
        long slowResult = PairWiseSlow.maxPairwiseProduct(input);
        Assert.assertEquals(9000000000L,result);
        //Assert.assertEquals(9000000000L,slowResult);
    }
    @org.junit.Test
    public void simpleFaileNumbers() throws Exception {
        long[] input = new long[]{10,2};
        long result = PairWise.maxPairwiseProduct(input);
        //long slowResult = PairWiseSlow.maxPairwiseProduct(input);
        Assert.assertEquals(20L,result);
        //Assert.assertEquals(9000000000L,slowResult);
    }
}