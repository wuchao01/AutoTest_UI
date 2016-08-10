package com.pingan.autotest_ui.base;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by wuchao on 16/8/10.
 */
public class ObjctPageBase {
    public ObjctPageBase(WebDriver driver) {
        if (driver.getClass().getSimpleName().contains("android") || driver.getClass().getSimpleName().contains("ios")) {
            PageFactory.initElements(new AppiumFieldDecorator(driver, 6, TimeUnit.SECONDS), this);
        } else {
            PageFactory.initElements(driver, this);
        }
    }
}
