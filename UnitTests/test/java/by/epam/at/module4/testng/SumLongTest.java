package by.epam.at.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLongTest extends BeforeAfterTest{

    @Test(dataProvider = "dp")
        public void testSumLong(long a, long b, long expected){
        long result = calculator.sum(a,b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name="dp")
    public Object[][] sumDataPr(){
            return new Object[][]{
                    {1L,4L,5L},
                    {-1L,2L,1L},
                    {0,-2L,-2L},
                    {-1L,1L,0}
            };
    }

}

