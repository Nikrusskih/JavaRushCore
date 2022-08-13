package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner name = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(name.nextLine());
        byte max = -127;
        while (fileInputStream.available() > 0){
            byte a = (byte) fileInputStream.read();
            if (a > max){
                max = a;
            }
        }
        fileInputStream.close();
        System.out.println(max);
    }
}
