package com.jiker.keju;

import java.math.BigDecimal;

public class CalculateFee {

    private int start = 2;

    private int over = 8;

    public int calculate(int miles, int elapsed) {
        float fee = 0;
        //分段计算
        //起步费
        BigDecimal startFee = new BigDecimal(new Charging().startFee());
        //非起步段
        BigDecimal nonStartFee = new BigDecimal(new Charging().nonStartFee(Math.max(miles-start,0)));
        //超过部分
        BigDecimal overFee = new BigDecimal(new Charging().overFee(Math.max(miles-over,0)));
        //等待时间
        BigDecimal elapsedFee = new BigDecimal(new Elapsed().charging(elapsed));
        //计算总额
        fee = startFee.add(nonStartFee).add(overFee).add(elapsedFee).floatValue();
        System.out.println(fee);
        return Math.round(fee);
    }
}
