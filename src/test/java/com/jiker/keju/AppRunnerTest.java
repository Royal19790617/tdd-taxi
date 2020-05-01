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
            Assert.assertEquals("收费6元\\n收费7元\\n收费13元\\n收费7元\\n",appRunner.readFile(new File("src/main/resources/testData.txt")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
