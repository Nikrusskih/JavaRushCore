package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            throw new StringIndexOutOfBoundsException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ArithmeticException();
        }catch (Exception a){
            exceptions.add(a);
        }
        try {
            throw new NullPointerException();
        }catch (Exception b){
            exceptions.add(b);
        }
        try {
            throw new FileNotFoundException();
        }catch (Exception c){
            exceptions.add(c);
        }
        try {
            throw new EmptyStackException();
        }catch (Exception d){
            exceptions.add(d);
        }
        try {
            throw new NumberFormatException();
        }catch (Exception f){
            exceptions.add(f);
        }
        try {
            throw new ClassCastException();
        }catch (Exception g){
            exceptions.add(g);
        }
        try {
            throw new ArrayIndexOutOfBoundsException();
        }catch (Exception j){
            exceptions.add(j);
        }
        try {
            throw new IllegalStateException();
        }catch (Exception k){
            exceptions.add(k);
        }
        try {
            throw new NegativeArraySizeException();
        }catch (Exception l){
            exceptions.add(l);
        }
    }
}
