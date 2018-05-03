package ru.vr.sandbox;

import org.junit.Assert;
import org.junit.Test;

public class SquareTests {

    @Test
    public void testArea () {
        Square square = new Square(5);
        Assert.assertEquals(25, square.area());
    }
}
