package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream fileInputStream = new FileInputStream(sc.nextLine());
        byte min = 127;
        for (int i = 0; i < fileInputStream.available(); i++) {
            byte a = (byte) fileInputStream.read();
            if (a < min){
                min = a;
            }
        }
        fileInputStream.close();
        System.out.println(min);
    }
}
