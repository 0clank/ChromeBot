package com.chrome.bot.implement.web;

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
     * Opens the Browser to allow the controlling of elements <p>
     * The Browser will be automatically open when using the BrowserFactory
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

}
