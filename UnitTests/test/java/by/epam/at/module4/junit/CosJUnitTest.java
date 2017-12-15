package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class CosJUnitTest extends BeforeAfterJUnitTest {

    private double a;
    private double expected;

    public CosJUnitTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> values() {
        return Arrays.asList(new Object[][]{{Math.PI / 4, 0.707107}, {0, 1},
                {Math.PI / 6, 0.866025}, {Math.PI / 2, 0}});
    }

    @Test
    public void testCos() {
        double result = round(calculator.cos(a));
        Assert.assertEquals(expected, result, 0.001);
    }

    private double round(double value) {
        return (double) Math.round(value * 1000000d) / 1000000d;
    }
}
