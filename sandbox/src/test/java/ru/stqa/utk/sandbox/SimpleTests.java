package ru.stqa.utk.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Tonya on 26.10.2017.
 */
public class SimpleTests {
  @Test
public void testSimple(){
      Assert.assertTrue(Simple.isSimple(Integer.MAX_VALUE));
    }

    @Test
    public void testSimpleFast(){
        Assert.assertTrue(Simple.isSimpleFast(Integer.MAX_VALUE));
    }
}
