package com.pingan.autotest_ui.base;

import com.oracle.tools.packager.Log;
import com.pingan.autotest_ui.util.StartAppiumServer;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by wuchao on 16/8/3.
 */
public class AutoTestBase {
    protected static WebDriver driver;
    public static String platformName;
    public StartAppiumServer startAppiumServer;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite(alwaysRun = true)
    @Parameters({"filePath","appName","platformName","platformVersion","deviceName","appPackage","appActivity","port","udid","timeout"})
    public void beforeSuite(String filePath,String appName,String platformName,int platformVersion,String deviceName,String appPackage,String appActivity,int port,String udid,int timeout) throws MalformedURLException {
        if (platformName.toLowerCase().contains("android")||platformName.toLowerCase().contains("ios")){
            File appDir = new File(filePath);
            File app = new File(appDir,appPackage);
            Log.info("mobileCapabilities.filePath = " + filePath );
            Log.info("mobileCapabilities.appName = " + appName );
            Log.info("mobileCapabilities.platformName = " + platformName );
            Log.info("mobileCapabilities.platformVersion = " + platformVersion );
            Log.info("mobileCapabilities.deviceName = " + deviceName );
            Log.info("MobileCapabilityType.appPackage = " + appPackage);
            Log.info("MobileCapabilityType.appActivity = " + appActivity);
            Log.info("mobileCapabilities.port = " + port );
            Log.info("mobileCapabilities.udid = " + udid );
            Log.info("mobileCapabilities.timeout = " + timeout );
            startAppiumServer.run();
            //初始化测试组件
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"platformName");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"platformVersion");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"deviceName");
            capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,"appPackage");
            capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,"appActivity");
            capabilities.setCapability(MobileCapabilityType.UDID,"udid");

            if (platformName.toLowerCase().contains("android")){
                try {
                    driver = new AndroidDriver(new URL("http://127.0.0.1:"+ port + "/wd/hub"), capabilities);
                }
                catch (MalformedURLException e){
                    e.printStackTrace();
                }
                //设置超时
                driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
            }
            else {
                try {
                    driver = new IOSDriver(new URL("http://127.0.0.1:"+ port + "/wd/hub"),capabilities);
                }
                catch (MalformedURLException e){
                    e.printStackTrace();
                }
                //设置超时
                driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
            }
        }
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        if (platformName.toLowerCase().contains("android")||platformName.toLowerCase().contains("ios")){
            ((AppiumDriver) driver).removeApp("com.pingan.yztDev");
        }
        driver.quit();
    }
}
