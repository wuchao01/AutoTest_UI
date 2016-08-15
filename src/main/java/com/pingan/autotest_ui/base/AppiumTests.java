package com.pingan.autotest_ui.base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by wuchao on 16/8/12.
 */
public class AppiumTests {
    private AppiumDriver driver;
    public AppOperate operateBase;

    @BeforeTest
    public void setUp() throws Exception {
        //配置webdriver
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName","iPhone");
        capabilities.setCapability("platformVersion", "9.3.4");
        capabilities.setCapability("udid", "560d1ec4bf09b200474d9fc50d8499ef59141649");
        //appium的独特地方,使用自己的AppiumDriver, 它本身是继承自WebDriver
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        //设置超时
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }


    public void taobao_search() throws InterruptedException{
        operateBase.acceptAlert();
        operateBase.swipeToRight(3000);
        //找输入框并点击
        WebElement text = driver.findElementByXPath("//UIAButton[@name='skipbuttonbg']");
        text.click();

    }
}
