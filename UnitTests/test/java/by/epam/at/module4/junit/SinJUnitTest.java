package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class SinJUnitTest extends BeforeAfterJUnitTest {

    private double a;
    private double expected;

    public SinJUnitTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> values() {
        return Arrays.asList(new Object[][]{{Math.PI / 4, 0.707107}, {-0,0},
                {Math.PI / 6, 0.5}, {Math.PI / 2, 1.0}});
    }

    @Test
    public void testSin() {
        double result = calculator.sin(a);
        Assert.assertEquals(expected, result, 0.001);
    }
}
