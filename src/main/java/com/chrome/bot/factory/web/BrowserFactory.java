package com.chrome.bot.factory.web;

import com.chrome.bot.implement.web.IBrowser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    /** Logger */
    private static final Logger LOGGER = LoggerFactory.getLogger(BrowserFactory.class);

    /** Base URL */
    private static final String URL_BASE = "https://chromedriver.storage.googleapis.com/index.html?path=78.0.3904.70/";

    /** File prefix */
    private static final String URL_FILE_PREFIX = "chromedriver_";

    /** File suffix */
    private static final String URL_FILE_SUFFIX = ".zip";

    /** File name for linux */
    private static final String URL_LINUX = "linux64";

    /** File name for mac */
    private static final String URL_MAC = "mac64";

    /** File name for win */
    private static final String URL_WIN = "win32";

    /**
     * Automatically downloads the newest version of ChromeDriver. <p>
     * Sets the System path to that driver and creates an object of IBrowser
     *
     * @return The IBrowser object
     *
     * @see IBrowser
     */
    public static IBrowser simplified () {
        LOGGER.info("Creating Browser");
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
