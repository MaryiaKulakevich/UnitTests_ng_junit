package by.epam.at.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends BeforeAfterTest {

    @Test(dataProvider="dp")
    public void testPow(double a, double b, double expected){
        double result = calculator.pow(a,b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name= "dp")
    public Object [][] powDataPr(){
        return new Object[][]{
            {2,3,8},
            {2,-3,0.125},
            {5,0,1},
            {-0.5,3,-0.125},
            {625,0.75,125},
            {100,-0.5,0.1}
        };
    }
}
