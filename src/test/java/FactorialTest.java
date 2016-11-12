import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/4/16.
 */
public class FactorialTest {
    Factorial factorial;
    @Before
    public void setUp() throws Exception {
        factorial = new Factorial();
    }

    @Test
    public void factorial() throws Exception {
        long result = factorial.factorial(5L);
        Assert.assertEquals(120L,result);
    }
    @Test
    public void zero() throws Exception {
        long result = factorial.factorial(0L);
        Assert.assertEquals(1L,result);
    }

}