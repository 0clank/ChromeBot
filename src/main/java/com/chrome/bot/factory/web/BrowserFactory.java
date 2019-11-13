package com.chrome.bot.factory.web;

import com.chrome.bot.implement.web.IBrowser;

/**
 * ChromeBot <p>
 * BrowserFactory.java <p>
 * Factory to create a IBrowser object
 *
 * @author q1x
 * @version 1.0
 * @since 13 Nov 2019 18:32
 */
public class BrowserFactory {

    /**
     * Automatically downloads the newest version of ChromeDriver. <p>
     * Sets the System path to that driver and creates an object of IBrowser
     *
     * @return The IBrowser object
     *
     * @see IBrowser
     */
    public static IBrowser simplified () {
        return null;
    }

    /**
     * Sets the System path to that driver and creates an object of IBrowser
     *
     * @param chromePath Path to the downloaded ChromeDriver
     * @return The IBrowser Object
     */
    public static IBrowser chrome(String chromePath) {
        return null;
    }

    /**
     * Opens a firefox instance of IBrowser
     *
     * @return The IBrowser object
     */
    public static IBrowser firefox() {
        return null;
    }

    /**
     * Opens a safari instance of IBrowser
     *
     * @return The IBrowser object
     */
    public static IBrowser Safari() {
        return null;
    }

}
