package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class SubDoubleJUnitTest extends BeforeAfterJUnitTest {

       private double a;
       private double b;
       private double expected;

       public SubDoubleJUnitTest(double a, double b, double expected){
           this.a = a;
           this.b = b;
           this.expected = expected;
       }

       @Parameterized.Parameters
        public static Collection<Object[]> values(){
        return  Arrays.asList(new Object[][] { { 3D, 1D, 2D }, { 1D, -1D, 2D },
                { -5D, -5D, 0} });

    }

    @Test
    public void testSubDouble(){
        double result = calculator.sub(a, b);
        Assert.assertEquals(expected, result, 0 );
    }



}
