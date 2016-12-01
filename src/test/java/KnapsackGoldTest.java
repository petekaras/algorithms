import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peter on 12/1/16.
 */
public class KnapsackGoldTest {
    KnapsackGold k;
    @Before
    public void setup(){
      k = new KnapsackGold();
    }


    @Test
    public void optimalWeight() throws Exception {
        int[] data = new int[]{1,4,8};
        int result = KnapsackGold.optimalWeight(10,data);
        Assert.assertEquals(9,result);
    }

    @Test
    public void more() throws Exception {
        int[] data = new int[]{5,7,12,18};
        int result = KnapsackGold.optimalWeight(20,data);
        Assert.assertEquals(19,result);
    }

    @Test
    public void moreMore() throws Exception {
        int[] data = new int[]{3,5,3,3,5};
        int result = KnapsackGold.optimalWeight(10,data);
        Assert.assertEquals(10,result);
    }

}