import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/18/16.
 */
public class ChangeTest {
    @Test
    public void small() throws Exception {
        Assert.assertEquals(2,Change.change(2));
    }

    @Test
    public void case8() throws Exception {
        Assert.assertEquals(3,Change.change(16));
    }

    @Test
    public void fives() throws Exception {
        Assert.assertEquals(1,Change.change(5));
    }

    @Test
    public void big() throws Exception {
        Assert.assertEquals(6,Change.change(28));
    }

    @Test
    public void simple() throws Exception {
        Assert.assertEquals(3,Change.change(30));
    }

    @Test
    public void edge() throws Exception {
        Assert.assertEquals(1,Change.change(1));
    }

    @Test
    public void edgeTen() throws Exception {
        Assert.assertEquals(7,Change.change(29));
    }
    @Test
    public void edgeFive() throws Exception {
        Assert.assertEquals(4,Change.change(26));
    }
    @Test
    public void massive() throws Exception {
        Assert.assertEquals(1000,Change.change(10000));
    }
}