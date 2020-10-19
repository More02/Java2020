package ru.more02.ex31;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
class TestTest {


    @org.junit.jupiter.api.Test
    void summ() {
        Test test = new Test(3, 4, 0);
        Assert.assertNotNull(test);
    }

    @org.junit.jupiter.api.Test
    void multiplication() {
        Test test = null;
        Assert.assertNotNull(test);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Test test = new Test(1, 0, 0);
        Assert.assertNotEquals(0,test.b);
    }
}