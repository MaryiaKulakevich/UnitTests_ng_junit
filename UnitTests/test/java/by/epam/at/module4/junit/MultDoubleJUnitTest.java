package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class MultDoubleJUnitTest extends BeforeAfterJUnitTest {

       private double a;
       private double b;
       private double expected;

       public MultDoubleJUnitTest(double a, double b, double expected){
           this.a = a;
           this.b = b;
           this.expected = expected;
       }

       @Parameterized.Parameters
        public static Collection<Object[]> values(){
        return  Arrays.asList(new Object[][] { { 1.5, 1.5, 2.25 }, { 1.9999, 1.9999, 3.9996},
                { 1.0, 0.5, 0.5 } });

    }

    @Test
    public void testMultDouble(){
        double result = round(calculator.mult(a, b));
        Assert.assertEquals(expected,result, 0 );
    }

    private double round(double value) {
        return (double) Math.round(value * 10000d) / 10000d;
    }

}
