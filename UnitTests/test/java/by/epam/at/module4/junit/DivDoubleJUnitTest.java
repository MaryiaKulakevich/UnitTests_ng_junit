package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class DivDoubleJUnitTest extends BeforeAfterJUnitTest {

       private double a;
       private double b;
       private double expected;

       public DivDoubleJUnitTest(double a, double b, double expected){
           this.a = a;
           this.b = b;
           this.expected = expected;
       }

       @Parameterized.Parameters
        public static Collection<Object[]> values(){
        return  Arrays.asList(new Object[][] { { 3D, 1D, 3D }, { 1D, -1D, -1D },
                { 0D, -5D, 0D } });

    }

    @Test
    public void testDivDouble(){
        double result = calculator.div(a, b);
        Assert.assertEquals(expected,result,0 );
    }

    @Test(expected = ArithmeticException.class)
    public void testDivDoubleThrowsException (){
        calculator.div(2,0);
    }

}
