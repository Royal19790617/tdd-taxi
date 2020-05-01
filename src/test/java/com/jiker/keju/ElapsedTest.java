package com.jiker.keju;

import org.junit.Assert;
import org.junit.Test;

public class ElapsedTest     {
    @Test
    public void elapsed_test() {
        Elapsed elapsed = new Elapsed();
        Assert.assertEquals("0.25",elapsed.charging(1));
    }
}
