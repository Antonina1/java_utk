package ru.stqa.utk.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Tonya on 26.07.2017.
 */
public class SquareTest {
    @Test
    public void testArea() {
        Square s = new Square(5);
        Assert.assertEquals(s.area(),25.0);
    }
}