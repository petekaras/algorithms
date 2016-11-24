import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/24/16.
 */
public class SortingTest {
    @Test
    public void randomizedQuickSort() throws Exception {
        int[] data = new int[]{2,3,9,2,2};
        Sorting.randomizedQuickSort(data,0,data.length-1);
        Assert.assertArrayEquals(new int[]{2,2,2,3,9},data);

    }

    @Test
    public void partition2() throws Exception {
        int[] data = new int[]{2,6,7,2,2,1,2,8,9};
        Sorting.partition2(data,0,data.length-1);
        Assert.assertArrayEquals(new int[]{2,2,2,1,2,6,7,8,9},data);
    }
    @Test
    public void partition3() throws Exception {
        int[] data = new int[]{2,6,7,2,10,2,1,2,8,9,2};
        Sorting.partition3(data,0,data.length-1);
        //m1 = 0: numbers lower
        //m2 = 5: numbers higer
        System.out.println(Arrays.toString(data));
        Assert.assertArrayEquals(new int[]{1,2,2,2,2,2,6,10,8,9,7},data);
    }
}