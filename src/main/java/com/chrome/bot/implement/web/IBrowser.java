package com.chrome.bot.implement.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * ChromeBot <p>
 * IBrowser.java <p>
 * Represents a browser running on the local machine. <p>
 * Allows to read, write and interact with elements on a website. <p>
 * Using the x-path, path or name of that element. <p>
 *
 * @author q1x
 * @version 1.0
 * @since 12 Nov 2019 13:34
 */
public interface IBrowser {

    /**
     * Opens the Browser to allow the controlling of elements. <p>
     * The Browser will be automatically open when using the BrowserFactory.
     *
     * @return {@code true} if successfully opened the browser {@code false} if not
     */
    boolean open();

    /**
     * Closes the browser.
     *
     * @return {@code true} if successfully closed the browser {@code false} if not
     */
    boolean close();

    /**
     * Forces the browser to close not matter what it's currently doing.
     *
     * @return {@code true} if successfully closed the browser {@code false} if not
     */
    boolean forceClose();

    /**
     * Redirects to the specified url.
     *
     * @param url Url to redirect to
     */
    void redirect(String url);

    /**
     * Find a 'WebElement' by a By object.
     *
     * @param by By object to find the WebElement
     * @return The WebElement found
     */
    WebElement find(By by);

    /**
     * Finds a 'WebElement' by a By object and clicks it right after.
     *
     * @param by By object to find the WebElement to click
     */
    void click(By by);

    /**
     * Inserts a text into a 'WebElement' found by the By object. Have to be a writable html object.
     *
     * @param by By object to find the WebElement to insert text into
     * @param charSequence String to add into the textfield
     */
    void insert(By by, String charSequence);

    /**
     * Inserts a 'Enter key' into a 'WebElement' found by the By object. Have to be a writable html object.
     *
     * @param by By object to find the WebElement to insert text into
     */
    void enter(By by);
}
