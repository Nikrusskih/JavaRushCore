package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        bufferedReader.close();

        FileReader reader = new FileReader(name1.toString());
        FileWriter writer = new FileWriter(name2.toString());

        while (reader.ready()) {
            int data = reader.read();
            data = reader.read();
            writer.write(data);
        }
        reader.close();
        writer.close();
    }
}
