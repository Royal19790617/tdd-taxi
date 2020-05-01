package com.jiker.keju;

import org.junit.Assert;
import org.junit.Test;

public class CalculateFeeTest {

    @Test
    public void calculateFeeTest() {
        CalculateFee calculateFee = new CalculateFee();
        Assert.assertEquals(6,calculateFee.calculate(1,0));
        Assert.assertEquals(7,calculateFee.calculate(3,0));
        Assert.assertEquals(13,calculateFee.calculate(10,0));
        Assert.assertEquals(7,calculateFee.calculate(2,3));
    }
}
