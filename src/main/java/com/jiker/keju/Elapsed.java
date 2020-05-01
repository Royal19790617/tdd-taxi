package com.jiker.keju;

public class Elapsed {

    private float perMinute = (float) 0.25;

    public String charging(int minutes) {
        return Float.toString(perMinute*minutes);
    }
}
