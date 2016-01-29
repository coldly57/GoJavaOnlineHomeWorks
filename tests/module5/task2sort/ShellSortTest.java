package module5.task2sort;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShellSortTest {

    private static Integer[] testArray;
    private static int[] expectedArray;

    @BeforeClass
    public static void setUpClass() throws Exception {
        testArray = new Integer[]{1, 17, 29, 90, 56, -4, -9, 6, 0, 11, -50, -30, 18, 29};
        expectedArray = new int[testArray.length];

        for (int i = 0; i < expectedArray.length; i++){
            expectedArray[i] = testArray[i];
        }

        for (int i = 0; i < expectedArray.length; i++){
            for (int j = i + 1; j < expectedArray.length; j++){
                if (expectedArray[i] > expectedArray[j]){
                    int temp = expectedArray[i];
                    expectedArray[i] = expectedArray[j];
                    expectedArray[j] = temp;
                }
            }
        }
    }

    @Test(timeout = 3000)
    public void testSort() throws Exception {

        int[] newArray = new int[testArray.length];

        for (int i = 0; i < newArray.length; i++){
            newArray[i] = (int)ShellSort.sort(testArray)[i];
        }

        Assert.assertArrayEquals(expectedArray, newArray);
    }
}