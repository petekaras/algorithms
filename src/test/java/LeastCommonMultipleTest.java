import org.junit.Assert;
import org.junit.Test;

/**
 * Created by peter on 11/11/16.
 */
public class LeastCommonMultipleTest {
    @Test
    public void same() throws Exception {
        long result = LeastCommonMultiple.lcm(6,6);
        Assert.assertEquals(6,result);
    }

    @Test
    public void small() throws Exception {
        long result = LeastCommonMultiple.lcm(6,8);
        Assert.assertEquals(24,result);
    }

    @Test
    public void big() throws Exception {
        long result = LeastCommonMultiple.lcm(28851538,1183019);
        Assert.assertEquals(1933053046,result);
    }
}