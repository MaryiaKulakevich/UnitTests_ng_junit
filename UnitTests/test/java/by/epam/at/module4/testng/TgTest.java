package by.epam.at.module4.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgTest extends BeforeAfterTest{

    @Test(dataProvider = "dp")
    public void testTg (double a, double expected){
        double result = round(calculator.tg(a));
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name ="dp")
    public Object [][] tgDataPr (){
        return new Object[][]{
                {Math.PI / 4, 1},
                {0,0},
                {Math.PI / 3, 1.732051},
                {Math.PI / 6, 0.57735}
        };
    }

    private double round(double value) {
        return (double)Math.round(value * 1000000d) / 1000000d;
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testTgThrowsException() {
        calculator.tg(Math.PI/2);
    }
}
