import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by peter on 11/18/16.
 */
public class CoveringSegmentsTest {
    @Test
    public void small() throws Exception {
        CoveringSegments.Segment[] segments = new CoveringSegments.Segment[]{
                new CoveringSegments.Segment(1,3),
                new CoveringSegments.Segment(2,5),
                new CoveringSegments.Segment(3,6)
        };
        int[] result = CoveringSegments.optimalPoints(segments);
        Assert.assertEquals(1,result.length);
        Assert.assertEquals(3,result[0]);
    }

    @Test
    public void bigger() throws Exception {
        CoveringSegments.Segment[] segments = new CoveringSegments.Segment[]{
                new CoveringSegments.Segment(4,7),
                new CoveringSegments.Segment(1,3),
                new CoveringSegments.Segment(2,5),
                new CoveringSegments.Segment(5,6)
        };
        int[] result = CoveringSegments.optimalPoints(segments);
        Assert.assertEquals(2,result.length);
        Assert.assertEquals(3,result[0]);
        Assert.assertEquals(6,result[1]);
    }
    @Test
    public void hundred() throws Exception {
        CoveringSegments.Segment[] segments = new CoveringSegments.Segment[]{
                new CoveringSegments.Segment(41, 42),
                new CoveringSegments.Segment(52, 52),
                new CoveringSegments.Segment(63, 63),
                new CoveringSegments.Segment(80, 82),
                new CoveringSegments.Segment(78, 79),
                new CoveringSegments.Segment(35, 35),
                new CoveringSegments.Segment(22, 23),
                new CoveringSegments.Segment(31, 32),
                new CoveringSegments.Segment(44, 45),
                new CoveringSegments.Segment(81, 82),
                new CoveringSegments.Segment(36, 38),
                new CoveringSegments.Segment(10, 12),
                new CoveringSegments.Segment(1 ,1),
                new CoveringSegments.Segment(23, 23),
                new CoveringSegments.Segment(32, 33),
                new CoveringSegments.Segment(87, 88),
                new CoveringSegments.Segment(55, 56),
                new CoveringSegments.Segment(69, 71),
                new CoveringSegments.Segment(89, 91),
                new CoveringSegments.Segment(93, 93),
                new CoveringSegments.Segment(38, 40),
                new CoveringSegments.Segment(33, 34),
                new CoveringSegments.Segment(14, 16),
                new CoveringSegments.Segment(57, 59),
                new CoveringSegments.Segment(70, 72),
                new CoveringSegments.Segment(36, 36),
                new CoveringSegments.Segment(29, 29),
                new CoveringSegments.Segment(73, 74),
                new CoveringSegments.Segment(66, 68),
                new CoveringSegments.Segment(36, 38),
                new CoveringSegments.Segment(1, 3),
                new CoveringSegments.Segment(49, 50),
                new CoveringSegments.Segment(68, 70),
                new CoveringSegments.Segment(26, 28),
                new CoveringSegments.Segment(30, 30),
                new CoveringSegments.Segment(1, 2),
                new CoveringSegments.Segment(64, 65),
                new CoveringSegments.Segment(57, 58),
                new CoveringSegments.Segment(58, 58),
                new CoveringSegments.Segment(51, 53),
                new CoveringSegments.Segment(41, 41),
                new CoveringSegments.Segment(17, 18),
                new CoveringSegments.Segment(45, 46),
                new CoveringSegments.Segment(4 ,4),
                new CoveringSegments.Segment(0 ,1),
                new CoveringSegments.Segment(65, 67),
                new CoveringSegments.Segment(92, 93),
                new CoveringSegments.Segment(84, 85),
                new CoveringSegments.Segment(75, 77),
                new CoveringSegments.Segment(39, 41),
                new CoveringSegments.Segment(15, 15),
                new CoveringSegments.Segment(29, 31),
                new CoveringSegments.Segment(83, 84),
                new CoveringSegments.Segment(12, 14),
                new CoveringSegments.Segment(91, 93),
                new CoveringSegments.Segment( 83, 84),
                new CoveringSegments.Segment(81, 81),
                new CoveringSegments.Segment(3, 4),
                new CoveringSegments.Segment(66, 67),
                new CoveringSegments.Segment(8, 8),
                new CoveringSegments.Segment(17, 19),
                new CoveringSegments.Segment(86, 87),
                new CoveringSegments.Segment(44, 44),
                new CoveringSegments.Segment(34, 34),
                new CoveringSegments.Segment(74, 74),
                new CoveringSegments.Segment(94, 95),
                new CoveringSegments.Segment(79, 81),
                new CoveringSegments.Segment(29, 29),
                new CoveringSegments.Segment(60, 61),
                new CoveringSegments.Segment(58, 59),
                new CoveringSegments.Segment(62, 62),
                new CoveringSegments.Segment(54, 56),
                new CoveringSegments.Segment(58, 58),
                new CoveringSegments.Segment(79, 79),
                new CoveringSegments.Segment(89, 91),
                new CoveringSegments.Segment(40, 42),
                new CoveringSegments.Segment(2, 4),
                new CoveringSegments.Segment(12, 14),
                new CoveringSegments.Segment(5, 5),
                new CoveringSegments.Segment(28, 28),
                new CoveringSegments.Segment(35, 36),
                new CoveringSegments.Segment(7, 8),
                new CoveringSegments.Segment(82, 84),
                new CoveringSegments.Segment(49, 51),
                new CoveringSegments.Segment(2 ,4),
                new CoveringSegments.Segment(57, 59),
                new CoveringSegments.Segment(25, 27),
                new CoveringSegments.Segment(52, 53),
                new CoveringSegments.Segment(48, 49),
                new CoveringSegments.Segment(9, 9),
                new CoveringSegments.Segment(10, 10),
                new CoveringSegments.Segment(78, 78),
                new CoveringSegments.Segment(26, 26),
                new CoveringSegments.Segment(83, 84),
                new CoveringSegments.Segment(22, 24),
                new CoveringSegments.Segment(86,87),
                new CoveringSegments.Segment(52, 54),
                new CoveringSegments.Segment(49, 51),
                new CoveringSegments.Segment(63, 64),
                new CoveringSegments.Segment(54, 54),
                new CoveringSegments.Segment(4,7),
                new CoveringSegments.Segment(1,3),
                new CoveringSegments.Segment(2,5),
                new CoveringSegments.Segment(5,6)
        };
        int[] result = CoveringSegments.optimalPoints(segments);
        Assert.assertEquals(43,result.length);
    }
}