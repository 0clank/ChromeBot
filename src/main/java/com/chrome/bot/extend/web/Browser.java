package com.chrome.bot.extend.web;

import com.chrome.bot.implement.web.IBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * ChromeBot <p>
 * Browser.java <p>
 * Base class of every browser type. <p>
 * Provides functions the control elements inside of the browser. <p>
 * Also it's the implementation of {@code IBrowser} <p><p>
 *
 * This class needs Selenium. For example maven: <p>
 * https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
 *
 * @author q1x
 * @version 1.0
 * @since 12 Nov 2019 18:19
 *
 * @see IBrowser
 */
public abstract class Browser implements IBrowser {

    /** WebDriver to control the browser */
    private WebDriver driver;

    /**
     * Getter for property 'driver'.
     *
     * @return Value for property 'driver'.
     */
    public WebDriver getDriver () {
        return driver;
    }

    /**
     * Setter for property 'driver'.
     *
     * @param driver Value to set for property 'driver'.
     * @return this
     */
    public Browser setDriver (WebDriver driver) {
        this.driver = driver;
        return this;
    }
}
