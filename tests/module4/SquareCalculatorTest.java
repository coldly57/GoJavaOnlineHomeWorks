package module4;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareCalculatorTest {

    private static double triangleSideLength;
    private static double triangleHeightLength;
    private static double rectangleSideALength;
    private static double rectangleSideBLength;
    private static double circleRadius;
    private static double expectedTriangleSquare;
    private static double expectedRectangleSquare;
    private static double expectedCircleSquare;

    @BeforeClass
    public static void setUpClass() throws Exception {
        triangleSideLength = 10;
        triangleHeightLength = 2;
        rectangleSideALength = 5;
        rectangleSideBLength = 10;
        circleRadius = 5;
        expectedTriangleSquare = 0.5 * triangleSideLength * triangleHeightLength;
        expectedRectangleSquare = rectangleSideALength * rectangleSideBLength;
        expectedCircleSquare = Math.PI * circleRadius * circleRadius;
    }

    @Test(timeout = 3000)
    public void testGetTriangleSquare() throws Exception {
        assertEquals(expectedTriangleSquare, SquareCalculator.getTriangleSquare(triangleSideLength, triangleHeightLength), 0);
    }

    @Test(timeout = 3000)
    public void testGetRectangleSquare() throws Exception {
        assertEquals(expectedRectangleSquare, SquareCalculator.getRectangleSquare(rectangleSideALength, rectangleSideBLength), 0);
    }

    @Test(timeout = 3000)
    public void testGetCircleSquare() throws Exception {
        assertEquals(expectedCircleSquare, SquareCalculator.getCircleSquare(circleRadius), 0);
    }
}