package by.epam.at.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultLongTest extends BeforeAfterTest {

    @Test(dataProvider = "dp")
    public void testMultLong (long a, long b, long expected){
      long result = calculator.mult(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider (name="dp")
    public  Object [][] multDataPr () {
            return  new Object[][]{
                    {1L,1L,1L},
                    {2L,0,0},
                    {3L,-2L,-6L}
            };
    }
}
