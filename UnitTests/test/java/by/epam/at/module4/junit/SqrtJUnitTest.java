package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class SqrtJUnitTest extends BeforeAfterJUnitTest {

    private double a;
    private double expected;

    public SqrtJUnitTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> values() {
        return Arrays.asList(new Object[][]{{9D, 3D}, {0, 0},
                {1D, 1D}, {0.0025, 0.05}});
    }

    @Test
    public void testSqrtDouble() {
        double result = calculator.sqrt(a);
        Assert.assertEquals(expected, result, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testSqrtThrowsException() {
        calculator.sqrt(-2.0);
    }
}
