package com.jiker.keju;

public class Charging {

    private final float startFee = 6;

    private final float perMile = (float) 0.8;

    private final float overDistanceRatio = (float) 0.5;

    public String startFee() {
        return Float.toString(startFee);
    }

    public String nonStartFee(int miles) {
        return Float.toString(perMile*miles);
    }

    public String overFee(int miles) {
        return  Float.toString(perMile*overDistanceRatio*miles);
    }
}
