package com.thinkinginjava.part3.shortcircuit;

/**
 * Created by vendin on 10.10.2017.
 */
public class ShortCircuitImpl implements ShortCircuit {
    @Override
    public boolean test1(int val) {
        System.out.println("test1(" + val + ")");
        System.out.println("result:" + (val < 1));
        return val < 1;
    }

    @Override
    public boolean test2(int val) {
        System.out.println("test2(" + val + ")");
        System.out.println("result:" + (val < 2));
        return val < 2;
    }

    @Override
    public boolean test3(int val) {
        System.out.println("test3(" + val + ")");
        System.out.println("result:" + (val < 3));
        return val < 3;
    }
}
