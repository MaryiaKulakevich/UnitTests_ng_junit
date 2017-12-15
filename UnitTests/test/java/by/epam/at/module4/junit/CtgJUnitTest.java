package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class CtgJUnitTest extends BeforeAfterJUnitTest {

    private double a;
    private double expected;

    public CtgJUnitTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> values() {
        return Arrays.asList(new Object[][]{{-Math.PI / 4, -1}, {Math.PI / 3, 0.5774},
                {Math.PI / 6, 1.7321}, {Math.PI / 2, 0}});
    }

    @Test
    public void testCtg() {
        double result = round(calculator.ctg(a));
        Assert.assertEquals(expected, result, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testCtgThrowsException() {
        calculator.ctg(0);
    }

    private double round(double value) {
        return (double) Math.round(value * 10000d) / 10000d;
    }

}
