package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.Scanner;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        String name3 = bufferedReader.readLine();

        FileOutputStream fileOutputStream = new FileOutputStream(name1, true);
        FileInputStream fileInputStream1 = new FileInputStream(name2);
        FileInputStream fileInputStream2 = new FileInputStream(name3);

        byte[] buffer1 = new byte[fileInputStream1.available()];
        byte[] buffer2 = new byte[fileInputStream2.available()];

        int count1 = fileInputStream1.read(buffer1);
        int count2 = fileInputStream2.read(buffer2);

        fileInputStream1.close();
        fileInputStream2.close();

        try {
            fileOutputStream.write(buffer1, 0, count1);
            fileOutputStream.write(buffer2, 0, count2);

        } catch (Exception e) {
            fileOutputStream.close();
        }
    }
}
