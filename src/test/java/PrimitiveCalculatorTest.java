import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/30/16.
 */
public class PrimitiveCalculatorTest {
    PrimitiveCalculator pc;
    @Before
    public void setup(){
        pc = new PrimitiveCalculator();
    }
    @Test
    public void onlyOne() throws Exception {

        Assert.assertEquals(1,pc.optimal_sequence(1).size());
    }

    @Test
    public void onlyTwo() throws Exception {

        Assert.assertEquals(2,pc.optimal_sequence(2).size());
    }

    @Test
    public void more() throws Exception {

        Assert.assertEquals(5,pc.optimal_sequence(5).size());

    }
    @Test
    public void aBitMore() throws Exception {

        Assert.assertEquals(5,pc.optimal_sequence(15).size());

    }
    @Test
    public void evenMore() throws Exception {

        Assert.assertEquals(14,pc.optimal_sequence(96234).size()-1);

    }
}