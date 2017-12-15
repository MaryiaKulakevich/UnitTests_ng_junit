package by.epam.at.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class DivDoubleTest extends BeforeAfterTest {

    @Test(dataProvider = "dp")
    public void testDivDouble(double a, double b, double expected) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expected);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivDoubleThrowsException() {
        calculator.div(0.2, 0);
    }

    @DataProvider(name = "dp")
    public Object[][] divDataPr() {
        return new Object[][]{
                {1D, -2D, -0.5},
                {5D, 3D, 5D/3D},
                {0, 0.05, 0}
        };
    }

}