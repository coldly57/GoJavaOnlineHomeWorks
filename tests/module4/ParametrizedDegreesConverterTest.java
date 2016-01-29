package module4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParametrizedDegreesConverterTest {

    private double fahrenheitDegrees;
    private double celsiusDegrees;
    private DegreesConverter degreesConverter = new DegreesConverter();

    public ParametrizedDegreesConverterTest(double fahrenheitDegrees, double celsiusDegrees){
        this.fahrenheitDegrees = fahrenheitDegrees;
        this.celsiusDegrees = celsiusDegrees;
    }

    @Parameterized.Parameters(name = "{index}: Fahrenheit to Celsius ({0} = {1}), Celsius to Fahrenheit ({1} = {0})")
    public static Iterable<Object[]> getParametrizedData(){
        return Arrays.asList(new Object[][]{
                {32, 0},
                {482, 250},
                {212, 100},
                {221, 105}
        });
    }

    @Test(timeout = 3000)
    public void testFahrenheitToCelsius() throws Exception {

        Assert.assertEquals(celsiusDegrees, degreesConverter.fahrenheitToCelsius(fahrenheitDegrees), 0);
    }

    @Test(timeout = 3000)
    public void testCelsiusToFahrenheit() throws Exception {

        Assert.assertEquals(fahrenheitDegrees, degreesConverter.celsiusToFahrenheit(celsiusDegrees), 0);

    }
}