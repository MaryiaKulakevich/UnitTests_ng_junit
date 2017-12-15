package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class TgJUnitTest extends BeforeAfterJUnitTest {

    private double a;
    private double expected;

    public TgJUnitTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> values() {
        return Arrays.asList(new Object[][]{{Math.PI / 4, 1}, {0, 0},
                {Math.PI / 3, 1.732051}, {Math.PI / 6, 0.57735}});
    }

    @Test
    public void testTg() {
        double result = round(calculator.tg(a));
        Assert.assertEquals(expected, result, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testTgThrowsException() { calculator.tg(Math.PI / 2);
    }

    private double round(double value) {
        return (double)Math.round(value * 1000000d) / 1000000d;
    }

}
