package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class DivLongJUnitTest extends BeforeAfterJUnitTest {

       private long a;
       private long b;
       private long expected;

       public DivLongJUnitTest(long a, long b, long expected){
           this.a = a;
           this.b = b;
           this.expected = expected;
       }

       @Parameterized.Parameters
        public static Collection<Object[]> values(){
        return  Arrays.asList(new Object[][] { { 3L, 1L, 3L }, { 1L, -1L, -1L },
                { 0L, -5L , 0L } });
    }

    @Test
    public void testDivLong(){
        long result = calculator.div(a, b);
        Assert.assertEquals(expected,result );
    }

    @Test(expected = ArithmeticException.class)
    public void testDivLongThrowsException (){
        calculator.div(2,0);
    }
}
