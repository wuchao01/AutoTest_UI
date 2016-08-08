package com.pingan.autotest_ui.base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

/**
 * Created by wuchao on 16/8/8.
 */
public abstract class AppOperate{
    protected static WebDriver driver;
    public abstract void acceptAlert();

    public AppOperate(WebDriver driver){
        this.driver = driver;
    }

    /**
     * This Method for swipe up
     * @param during
     */
    public void swipeToUp(int during) {
        int width = ((AppiumDriver)driver).manage().window().getSize().width;
        int height = ((AppiumDriver)driver).manage().window().getSize().height;
        ((AppiumDriver)driver).swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);
    }

    /**
     * This Method for swipe down
     * @param during
     */
    public void swipeToDown(int during) {
        int width = ((AppiumDriver)driver).manage().window().getSize().width;
        int height = ((AppiumDriver)driver).manage().window().getSize().height;
        ((AppiumDriver)driver).swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
    }

    /**
     * This Method for swipe Left
     * @param during
     */
    public void swipeToLeft(int during) {
        int width = ((AppiumDriver)driver).manage().window().getSize().width;
        int height = ((AppiumDriver)driver).manage().window().getSize().height;
        ((AppiumDriver)driver).swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
    }

    /**
     * This Method for swipe Right
     * @param during
     */
    public void swipeToRight(int during) {
        int width = ((AppiumDriver)driver).manage().window().getSize().width;
        int height = ((AppiumDriver)driver).manage().window().getSize().height;
        ((AppiumDriver)driver).swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);

    }


}
