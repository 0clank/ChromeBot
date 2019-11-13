package com.chrome.bot.extend.web;

import com.chrome.bot.implement.web.IBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
     * Constructs a new object.
     */
    public Browser () {
        super();
    }

    /**
     * Closes the browser.
     *
     * @return {@code true} if successfully closed the browser {@code false} if not
     */
    @Override
    public void close () {
        driver.close();
    }

    /**
     * Forces the browser to close not matter what it's currently doing.
     *
     * @return {@code true} if successfully closed the browser {@code false} if not
     */
    @Override
    public void quit () {
        driver.quit();
    }

    /**
     * Redirects to the specified url.
     *
     * @param url Url to redirect to
     */
    @Override
    public void redirect (String url) {
        driver.get(url);
    }

    /**
     * Find a 'WebElement' by a By object.
     *
     * @param by By object to find the WebElement
     *
     * @return The WebElement found
     */
    @Override
    public WebElement find (By by) {
        return driver.findElement(by);
    }

    /**
     * Finds a 'WebElement' by a By object and clicks it right after.
     *
     * @param by By object to find the WebElement to click
     */
    @Override
    public void click (By by) {
        driver.findElement(by).click();
    }

    /**
     * Inserts a text into a 'WebElement' found by the By object. Have to be a writable html object.
     *
     * @param by           By object to find the WebElement to insert text into
     * @param charSequence String to add into the textfield
     */
    @Override
    public void insert (By by, String charSequence) {
        driver.findElement(by).sendKeys(charSequence);
    }

    /**
     * Inserts a 'Enter key' into a 'WebElement' found by the By object. Have to be a writable html object.
     *
     * @param by By object to find the WebElement to insert text into
     */
    @Override
    public void enter (By by) {
        driver.findElement(by).sendKeys(Keys.RETURN);
    }

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
