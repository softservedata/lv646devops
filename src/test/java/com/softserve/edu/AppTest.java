package com.softserve.edu;

import org.junit.Test;

public class AppTest {

    @Test
    public void checkFirst() {
        // Code
        // TODO
        System.out.println("done checkFirst()");
    }
    
    @Test
    public void checkOne() {
        // Code
        Change ch = new Change();
        Data<Integer> d1 = new Data<>(1, 2);
        d1 = ch.one(d1);
        // TODO
        System.out.println("done checkOne()");
    }
}
