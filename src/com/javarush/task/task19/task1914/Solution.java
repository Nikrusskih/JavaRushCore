package com.javarush.task.task19.task1914;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(console);
        String result = byteArrayOutputStream.toString();

        String[] resultArray = result.split(" ");
        int a = Integer.parseInt(resultArray[0]);
        int b = Integer.parseInt(resultArray[2]);

        if (result.contains("+")){
            result = (a + b) + "";
        }else if (result.contains("*")){
            result = (a * b) + "";
        }else if (result.contains("-")){
            result = (a - b) + "";
        }
        System.out.println(byteArrayOutputStream.toString().replaceAll("[\r\n]", "") + result);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

