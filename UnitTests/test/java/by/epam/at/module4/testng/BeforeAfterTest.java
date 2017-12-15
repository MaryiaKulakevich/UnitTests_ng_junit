package by.epam.at.module4.testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

import java.util.Date;

public class BeforeAfterTest {

    protected Calculator calculator;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
    }

    @BeforeGroups(value = "t")
    public void beforeGroup() {
        System.out.println("Before groups");
    }

    @BeforeClass(groups = "t")
    public void beforeClass() {
        System.out.println("Before class: create an instance of calculator");
        calculator = new Calculator();
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }

    @AfterGroups(value = "t")
    public void afterGroup() {
        System.out.println("After groups");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After method");
    }

    protected void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));

    }
}