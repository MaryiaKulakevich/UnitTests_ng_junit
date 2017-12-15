package by.epam.at.module4.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class SubLongJUnitTest extends BeforeAfterJUnitTest {

       private long a;
       private long b;
       private long expected;

       public SubLongJUnitTest(long a, long b, long expected){
           this.a = a;
           this.b = b;
           this.expected = expected;
       }

       @Parameterized.Parameters
        public static Collection<Object[]> values(){
        return  Arrays.asList(new Object[][] { { 3L, 1L, 2L }, { 1L, -1L, 2L },
                { 5L, 5L , 0L } });

    }

    @Test
    public void testSubLong(){
        long result = calculator.sub(a, b);
        Assert.assertEquals(expected,result);
    }



}
