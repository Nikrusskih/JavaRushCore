package com.javarush.task.task18.task1807;

import java.io.*;
import java.util.Scanner;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner name = new Scanner(System.in);
        FileInputStream inputStream = new FileInputStream(name.nextLine());
        int count = 0;
        while (inputStream.available() > 0){
            if (inputStream.read() == ','){
                count++;
            }
        }
        inputStream.close();
        System.out.println(count);
    }
}
