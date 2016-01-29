package module9;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(value = Parameterized.class)
public class ParametrizedEncodeDecodeTest {

    private String testString;
    private String expectedString;
    private EncodeDecode encodeDecode;

    public ParametrizedEncodeDecodeTest(String testString, String expectedString, int encodeShift){
        this.testString = testString;
        this.expectedString = expectedString;
        encodeDecode = new EncodeDecode(encodeShift);
    }

    @Parameterized.Parameters(name = "{index}: encode ({0} ---> {1}), decode ({1} ---> {0}), shift: {2}")
    public static Iterable<Object[]> getParametrizedData(){
        return Arrays.asList(new Object[][]{
                {"Hello world", "Ifmmp xpsme", 1},
                {"Hello world", "Jgnnq yqtnf", 2},
                {"Hello world", "Khoor zruog", 3},
                {"Hello world", "Lipps asvph", 4},
        });
    }


    @Test(timeout = 3000)
    public void testEncode() throws Exception {
        String result = testString;
        encodeDecode.encode(result);
        Assert.assertEquals(expectedString, encodeDecode.getEncodedText());
    }

    @Test(timeout = 3000)
    public void testDecode() throws Exception {
        String result = expectedString;
        encodeDecode.decode(result);
        Assert.assertEquals(testString, encodeDecode.getDecodedText());
    }
}