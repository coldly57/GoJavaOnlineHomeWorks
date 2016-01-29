package module4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParametrizedCoordinatesCalculatorTest {

    private double x1;
    private double x2;
    private double y1;
    private double y2;
    private double expected;
    private static final CoordinatesCalculator coordinatesCalculator = new CoordinatesCalculator();

    public ParametrizedCoordinatesCalculatorTest(double x1, double y1, double x2, double y2, double expected) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: distance between points ({0}; {1}) and ({2}; {3}) = {4}")
    public static Iterable<Object[]> getParametrizedData(){
        return Arrays.asList(new Object[][]{
                {1, 1, 1, 3, 2},
                {2, 5, 2, 2, 3},
                {4, 9, 11, 9, 7},
                {5, 5, 10, 5, 5}
        });
    }

    @Test(timeout = 3000)
    public void testGetDistance() throws Exception {
        coordinatesCalculator.setX1(x1);
        coordinatesCalculator.setY1(y1);
        coordinatesCalculator.setX2(x2);
        coordinatesCalculator.setY2(y2);

        Assert.assertEquals(expected, coordinatesCalculator.getDistance(), 0);

    }
}