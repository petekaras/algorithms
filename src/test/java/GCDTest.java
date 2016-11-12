import org.junit.Assert;
import org.junit.Test;

/**
 * Created by peter on 11/11/16.
 */
public class GCDTest {
    @Test
    public void test() throws Exception {
        long result = GCD.calc(1344,217);
        Assert.assertEquals(7,result);
    }
    @Test
    public void baseCase() throws Exception {
        long result = GCD.calc(42,7);
        Assert.assertEquals(7,result);
    }
    @Test
    public void small() throws Exception {
        long result = GCD.calc(18,35);
        Assert.assertEquals(1,result);
    }
    @Test
    public void big() throws Exception {
        long result = GCD.calc(28851538, 1183019);
        Assert.assertEquals(17657,result);
    }
}