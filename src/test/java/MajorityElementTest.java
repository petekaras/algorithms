import org.junit.Assert;
import org.junit.Test;

/**
 * Created by peter on 11/24/16.
 */
public class MajorityElementTest {

    @Test
    public void get() throws Exception {
        int[] data = new int[]{2,2,2,3};
        Assert.assertEquals(2,MajorityElement.getMajorityElement(data));
    }
    @Test
    public void same() throws Exception {
        int[] data = new int[]{2,3,2,3};
        Assert.assertEquals(-1,MajorityElement.getMajorityElement(data));
    }

    @Test
    public void none() throws Exception {
        int[] data = new int[]{2,1,2,78};
        Assert.assertEquals(-1,MajorityElement.getMajorityElement(data));
    }
}