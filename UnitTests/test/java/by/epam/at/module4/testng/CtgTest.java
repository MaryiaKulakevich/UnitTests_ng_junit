package by.epam.at.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class CtgTest extends BeforeAfterTest{

    @Test(dataProvider = "dp")
    public void testCtg (double a, double expected){
        double result = round(calculator.ctg(a));
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name ="dp")
    public Object [][] ctgDataPr (){
        return new Object[][]{
                {-Math.PI / 4, -1},
                {Math.PI / 3, 0.5774},
                {Math.PI / 6, 1.7321},
                {Math.PI / 2, 0}
        };
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testCtgThrowsException() {
        calculator.ctg(0);
    }

    private double round(double value) {
        return (double)Math.round(value * 10000d) / 10000d;
    }
}
