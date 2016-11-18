import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/12/16.
 */
public class HugeFibonacciTest {
    @Test
    public void small() throws Exception {
        long result = HugeFibonacci.calc(1,239);
        Assert.assertEquals(1,result);
    }


    @Test
    public void big() throws Exception {
        long result = HugeFibonacci.calc(239,1000);
        Assert.assertEquals(161,result);
    }

    @Test
    public void bigger() throws Exception {
        long result = HugeFibonacci.calc(22816213588L, 30524);
        Assert.assertEquals(10249,result);
    }
}