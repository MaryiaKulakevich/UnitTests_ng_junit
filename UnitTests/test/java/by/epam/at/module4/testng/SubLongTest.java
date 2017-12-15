package by.epam.at.module4.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.epam.tat.module4.Timeout.sleep;

public class SubLongTest extends BeforeAfterTest {

    @Test(dataProvider = "dp")
    public void testSubLong(long a, long b, long expected){
        sleep(1);
        checkTime();
        long result = calculator.sub(a,b);
        Assert.assertEquals(result, expected, "Incorrect result:");
    }

    @DataProvider(name="dp")
    public Object[][] subDataPr(){
        return new Object[][]{
                {1L,2L,-1L},
                {3L,2L,1L},
                {0,-2L,2L},
                {1L,1L,0L}
        };
    }
}
