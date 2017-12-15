package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;

public class IsPositiveJUnitTest extends BeforeAfterJUnitTest {

    @Test
    public void testJUnitPositive1(){
        boolean result = calculator.isPositive(-100);
        Assert.assertTrue(result == false);
    }

    @Test
    public void testJUnitPositive2(){
        boolean result = calculator.isPositive(0);
        Assert.assertTrue(result == false);
    }

    @Test
    public void testJUnitPositive3(){
        boolean result = calculator.isPositive(105);
        Assert.assertTrue(result == true);
    }

}
