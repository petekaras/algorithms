import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/11/16.
 */
public class FibonacciLastDigitTest {
    @Test
    public void two() throws Exception {
        Assert.assertEquals(2,FibonacciLastDigit.calc_fib(3));
    }
    @Test
    public void four() throws Exception {
        Assert.assertEquals(3,FibonacciLastDigit.calc_fib(4));
    }
    @Test
    public void big() throws Exception {
        Assert.assertEquals(9,FibonacciLastDigit.calc_fib(331));
    }
    @Test
    public void really_big() throws Exception {
        Assert.assertEquals(5,FibonacciLastDigit.calc_fib(327305));
    }

}