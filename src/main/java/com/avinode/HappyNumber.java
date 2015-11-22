package com.avinode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by s_lor_000 on 11/22/2015.
 */
public class HappyNumber {

    /**
     * Checks if the number is Happy
     *
     * @param number number to check
     * @return true if valid Happy Number
     */
    public boolean isHappy(int number) {
        Set<Integer> unhappies = new HashSet<Integer>();
        while (unhappies.add(number)) {
            int squared = 0;
            while (number > 0) {
                squared += Math.pow(number % 10, 2);
                number /= 10;
            }
            number = squared;
        }
        return number == 1;
    }
}
