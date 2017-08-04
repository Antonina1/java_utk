package ru.stqa.utk.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.stqa.utk.sandbox.Point.*;

/**
 * Created by Tonya on 26.07.2017.
 */
public class PointTest {
@Test
    public void TestDistance()
    {
Point p1 = new Point (3,4);
Point p2 = new Point( 6,5);

        Assert.assertEquals(distance(p1,p2),3.1622776601683795);
    }
}
