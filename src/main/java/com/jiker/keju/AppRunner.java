package com.jiker.keju;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Pattern;

public class AppRunner {

    public static void main(String[] args) throws Exception{
        String testDataFile = args[0];
        String receipt = new AppRunner().readFile(new File("src/main/resources/"+testDataFile));
        System.out.println(receipt);
    }

    private String readFile(File file) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder("");
        String s = null;
        while((s = br.readLine())!=null){
            sb.append(getReceipt(getNumeric((System.lineSeparator()+s))));
        }
        br.close();
        return sb.toString();
    }

    private String getNumeric(String str) {
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        return p.matcher(str).replaceAll(" ").trim();
    }

    private String getReceipt(String oneLine) {
        String[] str = oneLine.split("\\s+");
        int fee = new CalculateFee().calculate(Integer.valueOf(str[0]),Integer.valueOf(str[1]));
        return new StringBuffer("").append("收费").append(fee).append("元\r\n").toString();
    }

}
