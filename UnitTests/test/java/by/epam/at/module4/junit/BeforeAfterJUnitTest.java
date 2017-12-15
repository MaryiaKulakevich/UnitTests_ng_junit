package by.epam.at.module4.junit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class BeforeAfterJUnitTest {

    protected static Calculator calculator;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
        calculator = new Calculator();
    }

    @Before
    public void beforeMethod(){
        System.out.println("Before method");
    }

    @After
    public void afterMethod(){
        System.out.println("After method");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }



}

