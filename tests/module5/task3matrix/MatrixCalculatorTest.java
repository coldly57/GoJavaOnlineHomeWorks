package module5.task3matrix;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixCalculatorTest {

    private static int[][] testMatrix;
    private static int[][] expectedAddMatrix;
    private static int[][] expectedSubMatrix;
    private static int[][] expectedMultMatrix;
    private static int[][] expectedTransposeMatrix;

    @BeforeClass
    public static void setUpClass() throws Exception {

        testMatrix = new int[][]{
                {4, 7, 11, 2, 5},
                {1, 2, 3, 4, 10},
                {15, 13, 3, 6, 9},
                {4, 7, 2, 5, 8},
                {18, 0, 1, 4, 7}
        };

        expectedAddMatrix = new int[][]{
                {8, 14, 22, 4, 10},
                {2, 4, 6, 8, 20},
                {30, 26, 6, 12, 18},
                {8, 14, 4, 10, 16},
                {36, 0, 2, 8, 14}
        };

        expectedSubMatrix = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        expectedMultMatrix = new int[][]{
                {286, 199, 107, 132, 240},
                {247, 78, 44, 88, 154},
                {304, 212, 234, 166, 343},
                {217, 103, 89, 105, 204},
                {229, 167, 216, 90, 180}
        };

        expectedTransposeMatrix = new int[][]{
                {4, 1, 15, 4, 18},
                {7, 2, 13, 7, 0},
                {11, 3, 3, 2, 1},
                {2, 4, 6, 5, 4},
                {5, 10, 9, 8, 7}
        };
    }

    @Test(timeout = 3000)
    public void testMatrixAdd() throws Exception {
        Assert.assertArrayEquals(expectedAddMatrix, MatrixCalculator.matrixAdd(testMatrix, testMatrix));
    }

    @Test(timeout = 3000)
    public void testMatrixSub() throws Exception {
        Assert.assertArrayEquals(expectedSubMatrix, MatrixCalculator.matrixSub(testMatrix, testMatrix));
    }

    @Test(timeout = 3000)
    public void testMatrixMult() throws Exception {
        Assert.assertArrayEquals(expectedMultMatrix, MatrixCalculator.matrixMult(testMatrix, testMatrix));
    }

    @Test(timeout = 3000)
    public void testMatrixTranspose() throws Exception {
        Assert.assertArrayEquals(expectedTransposeMatrix, MatrixCalculator.matrixTranspose(testMatrix));
    }
}