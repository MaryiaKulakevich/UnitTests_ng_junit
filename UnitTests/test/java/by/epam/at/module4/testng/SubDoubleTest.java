package by.epam.at.module4.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.epam.tat.module4.Timeout.sleep;

public class SubDoubleTest extends BeforeAfterTest {
    @Test(dataProvider = "dp")
    public void testSubDouble(double a, double b, double expected) {
        sleep(1);
        checkTime();
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name="dp")
    public Object[][] subDataPr(){
        return new Object[][]{
                {1.5,2.5,-1.0},
                {3D,2D,1D},
                {0,-2D,2D},
                {0.1e-10,0.1e-10,0}
        };
    }
}