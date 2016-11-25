import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/25/16.
 */
public class InversionsTest {
    @Test
    public void mergeSort() throws Exception {
        int[] data = new int[]{2,4,5,8,3,4,6,10};
        int[] result = new int[8];
        Inversions.mergeSort(data,result,0,data.length-1);
        Assert.assertArrayEquals(new int[]{2,3,4,4,5,6,8,10},result);
    }

    @Test
    public void inversionNumber() throws Exception {
        int[] data = new int[]{2,3,9,2,9};
        Assert.assertEquals(2,Inversions.getNumberOfInversions(data,new int[8],0,data.length-1)*2);
    }
    @Test
    public void mixedup() throws Exception {
        int[] data = new int[]{6,8,7,3,2,1};
        int[] result = new int[6];
        Inversions.getNumberOfInversions(data,result,0,data.length-1);
        Assert.assertArrayEquals(new int[]{1,2,3,6,7,8},result);
    }
    @Test
    public void noInversion() throws Exception {
        int[] data = new int[]{1,2,3,4};
        int[] result = new int[4];
        //Inversions.getNumberOfInversions(data,result,0,data.length-1);
        Assert.assertEquals(0,Inversions.getNumberOfInversions(data,result,0,data.length-1)*2);
        System.out.println(Arrays.toString(result));
        Assert.assertArrayEquals(new int[]{1,2,3,4},result);
    }
}