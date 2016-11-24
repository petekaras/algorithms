import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/24/16.
 */
public class BinarySearchTest {
    int[] data = new int[]{1, 5, 8, 12, 13};
    @Test
    public void search8() throws Exception {
        Assert.assertEquals(2,BinarySearch.search(data,8));
    }

    @Test
    public void search23() throws Exception {
        Assert.assertEquals(-1,BinarySearch.search(data,23));
    }

    @Test
    public void search1() throws Exception {
        Assert.assertEquals(0,BinarySearch.search(data,1));
    }

    @Test
    public void search11() throws Exception {
        Assert.assertEquals(-1,BinarySearch.search(data,11));
    }

    @Test
    public void search13() throws Exception {
        Assert.assertEquals(4,BinarySearch.search(data,13));
    }

}