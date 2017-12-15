package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;

public class IsNegativeJUnitTest extends BeforeAfterJUnitTest {

    @Test
    public void testJUnitPositive1(){
        boolean result = calculator.isNegative(-100);
        Assert.assertTrue(result == true);
    }

    @Test
    public void testJUnitPositive2(){
        boolean result = calculator.isNegative(0);
        Assert.assertTrue(result == false);
    }

    @Test
    public void testJUnitPositive3(){
        boolean result = calculator.isNegative(105);
        Assert.assertTrue(result == false);
    }

}
