package by.epam.at.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinTest extends BeforeAfterTest {

    @Test(dataProvider = "dp")
    public void testSin (double a, double expected){
        double result = round(calculator.sin(a));
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name ="dp")
    public Object [][] sinDataPr (){
        return new Object[][]{
                {Math.PI / 4, 0.707107},
                {-0,0},
                {Math.PI / 6, 0.5},
                {Math.PI / 2, 1.0}
        };
    }

    private double round(double value) {
        return (double)Math.round(value * 1000000d) / 1000000d;
    }
}
