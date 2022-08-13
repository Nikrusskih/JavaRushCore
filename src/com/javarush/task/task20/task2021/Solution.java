package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
*/

public class Solution implements Serializable {

    public static class SubSolution extends Solution {

    }

    public static void main(String[] args) {

    }

    public void writeObject(ObjectOutputStream outputStream) throws IOException{
        throw new NotSerializableException("Не сегодня!");
    }
    public void readObject(ObjectInputStream inputStream) throws IOException{
        throw new NotSerializableException("Давай завтра?!");
    }
}
