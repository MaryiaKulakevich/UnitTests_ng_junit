package by.epam.at.module4.junit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class SumLongJUnitTest extends BeforeAfterJUnitTest {

       private long a;
       private long b;
       private long expected;

       public SumLongJUnitTest (long a, long b, long expected){
           this.a = a;
           this.b = b;
           this.expected = expected;
       }

       @Parameterized.Parameters
        public static Collection<Object[]> values(){
        return  Arrays.asList(new Object[][] { { 3L, 1L, 4L }, { 1L, -1L, 0L },
                { 0L, -5L , -5L } });

    }

    @Test
    public void testSumLong(){
        long result = calculator.sum(a, b);
        Assert.assertEquals(expected,result );
    }



}
