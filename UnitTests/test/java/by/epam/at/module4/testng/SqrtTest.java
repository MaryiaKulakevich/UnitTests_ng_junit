package by.epam.at.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTest extends BeforeAfterTest {

    @Test(dataProvider = "dp")
    public void testSqrt(double a, double expected){
        double result = calculator.sqrt(a);
        Assert.assertEquals(result,expected);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testSqrtThrowsException() {
        calculator.sqrt(-25D);
    }


    @DataProvider (name ="dp")
    public Object [][] sqrtDataPr (){
        return new Object[][]{
                {9D, 3D},
                {0,0},
                {1D,1D},
                {0.0025,0.05}
        };
    }

}
