package by.epam.at.module4.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class isNegativeTest extends BeforeAfterTest {

    @Test(groups = "t")
    public void testCheckNegative1(){
        boolean result = calculator.isNegative(-100);
        Assert.assertTrue(result==true);
    }

    @Test(dependsOnGroups = "t")
    public void testCheckNegative2(){
        boolean result = calculator.isNegative(0);
        Assert.assertTrue(result==false);
    }

    @Test(groups = "t")
    public void testCheckNegative3(){
        boolean result = calculator.isNegative(1L);
        Assert.assertTrue(result==false);
    }
}
