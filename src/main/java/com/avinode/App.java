package com.avinode;

import java.util.stream.IntStream;

/**
 * Created by s_lor_000 on 11/18/2015.
 */
public class App {

    public static final int HIGHEST_NUMBER_TO_CHECK = 1000;

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        IntStream.range(1, HIGHEST_NUMBER_TO_CHECK + 1).filter(happyNumber::isHappy).forEach(i -> System.out.println(i));
    }

}
