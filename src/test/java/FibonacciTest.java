import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/11/16.
 */
public class FibonacciTest {
    @Test
    public void calc_fib() throws Exception {
        Assert.assertEquals(267914296,Fibonacci.calc_fib(42));
    }

    @Test
    public void zero() throws Exception {
        Assert.assertEquals(0,Fibonacci.calc_fib(0));
    }

    @Test
    public void one() throws Exception {
        Assert.assertEquals(1,Fibonacci.calc_fib(1));
    }

    @Test
    public void two() throws Exception {
        Assert.assertEquals(1,Fibonacci.calc_fib(2));
    }
    @Test
    public void three() throws Exception {
        Assert.assertEquals(2,Fibonacci.calc_fib(3));
    }
    @Test
    public void ten() throws Exception {
        Assert.assertEquals(55,Fibonacci.calc_fib(10));
    }

}