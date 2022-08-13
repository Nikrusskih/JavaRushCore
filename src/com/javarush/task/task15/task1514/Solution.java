package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static{
    labels.put(2.1, "Number1");
    labels.put(2.2, "Number2");
    labels.put(2.3, "Number3");
    labels.put(2.4, "Number4");
    labels.put(2.5, "Number5");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
