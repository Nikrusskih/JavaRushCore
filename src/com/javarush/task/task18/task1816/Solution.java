package com.javarush.task.task18.task1816;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        while (fileInputStream.available() > 0) {
            char ch = (char) fileInputStream.read();
            if (ch > 64 && ch < 91 || ch > 96 & ch < 123){
                count++;
            }
        }
        System.out.println(count);
        fileInputStream.close();
    }
}