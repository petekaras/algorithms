import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/18/16.
 */
public class AdRevenueTest {
    @Test
    public void simple() throws Exception {
        long[] ads = new long[]{23};
        long[] revenue = new long[]{39};
        Assert.assertEquals(897, AdRevenue.maxDotProduct(ads, revenue));
    }

    @Test
    public void lessSimple() throws Exception {
        long[] ads = new long[]{1, 3, -5};
        long[] revenue = new long[]{-2, 4, 1};

        Assert.assertEquals(23, AdRevenue.maxDotProduct(ads, revenue));
    }

    @Test
    public void bigger() throws Exception {
        long[] ads = new long[]{-9, -5, -3};
        long[] revenue = new long[]{2, 4, 6};

        Assert.assertEquals(-56, AdRevenue.maxDotProduct(ads, revenue));
    }
}