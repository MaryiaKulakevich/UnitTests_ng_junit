package by.epam.at.module4.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveTest extends BeforeAfterTest{

    @Test
    public void testPositive1(){
        boolean result = calculator.isPositive(-100);
        Assert.assertTrue(result==false);
    }

    @Test
    public void testPositive2(){
        boolean result = calculator.isPositive(0);
        Assert.assertTrue(result==false);
    }

    @Test
    public void testPositive3(){
        boolean result = calculator.isPositive(1L);
        Assert.assertTrue(result==true);
    }

}
