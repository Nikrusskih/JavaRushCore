package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        reader.close();

        FileInputStream fileInputStream1 = new FileInputStream(name1);
        FileInputStream fileInputStream2 = new FileInputStream(name2);
        FileOutputStream fileOutputStream = new FileOutputStream(name1);

        byte[] buffer1 = new byte[fileInputStream1.available()];
        byte[] buffer2 = new byte[fileInputStream2.available()];

        fileInputStream1.read(buffer1);
        fileInputStream2.read(buffer2);

        fileInputStream1.close();
        fileInputStream2.close();

        fileOutputStream.write(buffer2);
        fileOutputStream.write(buffer1);

        fileOutputStream.close();

    }
}
