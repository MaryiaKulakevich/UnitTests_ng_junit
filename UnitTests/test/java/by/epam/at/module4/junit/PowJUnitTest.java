package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class PowJUnitTest extends BeforeAfterJUnitTest {

       private double a;
       private double b;
       private double expected;

       public PowJUnitTest(double a, double b, double expected){
           this.a = a;
           this.b = b;
           this.expected = expected;
       }

       @Parameterized.Parameters
        public static Collection<Object[]> values(){
        return  Arrays.asList(new Object[][] { { 5D,5D,3125D }, { 5.5,0,1 },
                {0.5,3,0.125}, {625,0.75,125}  });

    }

    @Test
    public void testPowDouble(){
        double result = calculator.pow(a, b);
        Assert.assertEquals(expected,result, 0 );
    }

}
