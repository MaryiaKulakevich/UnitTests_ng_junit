package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class MultLongJUnitTest extends BeforeAfterJUnitTest {

       private long a;
       private long b;
       private long expected;

       public MultLongJUnitTest(long a, long b, long expected){
           this.a = a;
           this.b = b;
           this.expected = expected;
       }

       @Parameterized.Parameters
        public static Collection<Object[]> values(){
        return  Arrays.asList(new Object[][] { { 3L, 3L, 9L }, { 1L, -2L, -2L },
                { 0L, 5L , 0L } });

    }

    @Test
    public void testMultLong(){
        long result = calculator.mult(a, b);
        Assert.assertEquals(expected,result );
    }

}
