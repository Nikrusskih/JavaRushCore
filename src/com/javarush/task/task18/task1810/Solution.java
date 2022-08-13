package com.javarush.task.task18.task1810;

import java.io.*;
import java.util.Scanner;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner fileName = new Scanner(System.in);
//        FileInputStream inputStream = new FileInputStream(fileName.nextLine());
        while (true) {
            FileInputStream  inputStream = new FileInputStream(fileName.nextLine());
            if (inputStream.available() < 1000){
                inputStream.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
