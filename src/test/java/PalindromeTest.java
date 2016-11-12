import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/4/16.
 */
public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @Test
    public void zero() throws Exception {
        Assert.assertTrue(palindrome.isPalendrome(""));
    }

    @Test
    public void one() throws Exception {
        Assert.assertTrue(palindrome.isPalendrome("x"));
    }
    @Test
    public void yes() throws Exception {
        Assert.assertTrue(palindrome.isPalendrome("asantalivedasadevilatnasa"));
    }
    @Test
    public void no() throws Exception {
        Assert.assertTrue(!palindrome.isPalendrome("motor"));
    }

}