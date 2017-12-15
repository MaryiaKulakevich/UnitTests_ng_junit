package by.epam.at.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivLongTest extends BeforeAfterTest {

    @Test(dataProvider = "dp")
    public void testDivLong (long a, long b, long expected){
      long result =  calculator.div(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivLongThrowsException (){
        calculator.div(2,0);
    }

    @DataProvider (name="dp")
    public  Object [][] divDataPr () {
            return  new Object[][]{
                    {1L,2L,0},
                    {2L,-1L,-2L},
                    {6L,2L,3L},
                    {0L,-2L,0}
            };
    }
}
