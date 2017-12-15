package by.epam.at.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultDoubleTest extends BeforeAfterTest {

    @Test(dataProvider = "dp")
    public void testMultDouble(double a, double b, double expected) {
        double result = round(calculator.mult(a, b));
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "dp")
    public Object[][] multDataPr() {
        return new Object[][]{
                {1.5, 1.5, 2.25},
                {1.9999, 1.9999, 3.9996},
                {-1.0, 0.5, -0.5}
        };
    }

    private double round(double value) {
        return (double) Math.round(value * 10000d) / 10000d;
    }
}