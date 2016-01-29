package module5.task1minandmax;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinAndMaxTest {

    private static int[] testArray;
    private static int expectedMax;
    private static int expectedMin;

    @BeforeClass
    public static void setUpClass() throws Exception {
        testArray = new int[]{1, 17, 29, 90, 56, -4, -9, 6, 0, 11, -50, -30, 18, 29};
        expectedMax = testArray[3];
        expectedMin = testArray[10];
    }

    @Test(timeout = 3000)
    public void testGetMinValue() throws Exception {
        assertEquals(expectedMin, MinAndMax.getMinValue(testArray));
    }

    @Test(timeout = 3000)
    public void testGetMaxValue() throws Exception {
        assertEquals(expectedMax, MinAndMax.getMaxValue(testArray));
    }
}