package com.avinode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by s_lor_000 on 11/22/2015.
 */
public class HappyNumberTest {

    private HappyNumber happyNumber = new HappyNumber();

    /**
     * Verify known happy numbers
     */
    @Test
    public void testIsHappy() {
        assertTrue(happyNumber.isHappy(31));
        assertTrue(happyNumber.isHappy(167));
        assertTrue(happyNumber.isHappy(313));
        assertTrue(happyNumber.isHappy(469));
        assertTrue(happyNumber.isHappy(608));
        assertTrue(happyNumber.isHappy(1000));
    }

    /**
     * Must be a positive integer
     */
    @Test
    public void testIfNull() {
        assertFalse(happyNumber.isHappy(0));
    }

    /**
     * Must be a positive integer
     */
    @Test
    public void testIfNegative() {
        assertFalse(happyNumber.isHappy(-1000));
    }

}