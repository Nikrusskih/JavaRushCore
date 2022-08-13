package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner file1 = new Scanner(System.in);
        Scanner file2 = new Scanner(System.in);
        FileInputStream inputStream = new FileInputStream(file1.nextLine());
        FileOutputStream outputStream = new FileOutputStream(file2.nextLine());

        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
            for (int i = buffer.length - 1; i >= 0; i--) {
                outputStream.write(buffer[i]);
            }

        inputStream.close();
//        outputStream.flush();
        outputStream.close();
    }
}
