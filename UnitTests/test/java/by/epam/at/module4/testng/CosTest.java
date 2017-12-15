package by.epam.at.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosTest extends BeforeAfterTest{

    @Test(dataProvider = "dp")
    public void testCos (double a, double expected){
        double result = round(calculator.cos(a));
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name ="dp")
    public Object [][] cosDataPr (){
        return new Object[][]{
                {Math.PI / 4, 0.707107},
                {0,1},
                {Math.PI / 6, 0.866025},
                {Math.PI / 2, 0}
        };
    }

    private double round(double value) {
        return (double)Math.round(value * 1000000d) / 1000000d;
    }
}
