package net.therap.SimpleInventory.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author rifatul.islam
 * @since 6/12/14.
 */

public class PriceIncrease {
    private static final Logger logger = LoggerFactory.getLogger(PriceIncrease.class);

    private int percentage;

    public void setPercentage(int i) {
        percentage = i;
        logger.info("Percentage set to " + i);
    }

    public int getPercentage() {
        return percentage;
    }

}