import org.junit.Assert;
import org.junit.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/18/16.
 */
public class KnapSackTest {
    @Test
    public void afew() throws Exception {
        int[] values = new int[]{60,100,120};
        int[] weights = new int[]{20,50,30};
        double result = KnapSack.getOptimalValue(50,values,weights);
        Assert.assertEquals(180.0000,result,4);
    }

    @Test
    public void one() throws Exception {
        int[] values = new int[]{500};
        int[] weights = new int[]{30};
        double result = KnapSack.getOptimalValue(10,values,weights);
        Assert.assertEquals(166.6667,result,4);
    }

}