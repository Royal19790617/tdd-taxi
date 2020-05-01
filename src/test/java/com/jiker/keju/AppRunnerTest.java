package com.jiker.keju;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class AppRunnerTest {
    @Test
    public void getNumric_test() {
        AppRunner appRunner = new AppRunner();
        Assert.assertEquals("1     0",appRunner.getNumeric("1公里,等待0分钟"));
    }

    @Test
    public void readFile_test() {
        AppRunner appRunner = new AppRunner();
        try {
            Assert.assertEquals("收费6元\\r\\n收费7元\\r\\n收费13元\\r\\n收费7元\\r\\n",appRunner.readFile(new File("src/main/resources/testData.txt")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getReciept_test() {
        AppRunner appRunner = new AppRunner();
        Assert.assertEquals("收费6元\\r\\n",appRunner.getReceipt("1     0"));
    }

}
