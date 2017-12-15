package by.epam.at.module4.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SumDoubleTest {


    @Test
    @Parameters({"a","b","expected"})
    public void testSumDouble(@Optional(value="1") double a, @Optional(value="1") double b, @Optional(value="2")double expected) {
        Calculator calculator = new Calculator();
         double result = calculator.sum(a, b);
        Assert.assertEquals(result, expected);
    }
}