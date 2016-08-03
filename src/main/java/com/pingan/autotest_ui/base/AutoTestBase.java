package com.pingan.autotest_ui.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

/**
 * Created by wuchao on 16/8/3.
 */
public class AutoTestBase {
   protected static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    public void beforeSuite(){

    }
}
