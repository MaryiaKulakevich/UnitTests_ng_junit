package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class SumDoubleJUnitTest extends BeforeAfterJUnitTest {

       private double a;
       private double b;
       private double expected;

       public SumDoubleJUnitTest(double a, double b, double expected){
           this.a = a;
           this.b = b;
           this.expected = expected;
       }

       @Parameterized.Parameters
        public static Collection<Object[]> values(){
        return  Arrays.asList(new Object[][] { { 3D, 1D, 4D }, { 1D, -1D, 0D },
                { 0D, -5D, -5D } });

    }

    @Test
    public void testSumDouble(){
        double result = calculator.sum(a, b);
        Assert.assertEquals(expected,result, 0 );
    }



}
