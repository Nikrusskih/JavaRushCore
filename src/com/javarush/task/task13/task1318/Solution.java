package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        InputStream input = new FileInputStream(path);
        BufferedReader buffer = new BufferedReader(new InputStreamReader(input));
        while (buffer.ready()){
        System.out.println(buffer.readLine());
        }
        input.close();
        buffer.close();
}
}