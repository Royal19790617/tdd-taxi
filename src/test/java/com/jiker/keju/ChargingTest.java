package com.jiker.keju;


import org.junit.Assert;
import org.junit.Test;

public class ChargingTest {

    @Test
    public void charging_start_fee_test() {
        Charging charging = new Charging();
        Assert.assertEquals("6.0",charging.startFee());

    }
    @Test
    public void charging_non_start_fee_test() {
        Charging charging = new Charging();
        Assert.assertEquals("0.8",charging.nonStartFee(1));

    }
    @Test
    public void charging_over_fee_test() {
        Charging charging = new Charging();
        Assert.assertEquals("0.4",charging.overFee(1));

    }
}
