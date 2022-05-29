package org.codej.labs;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        int[]arr = new int[]{20,10,23,34,56,78};
        String arr_toString = Arrays.toString(arr);
        String repl = arr_toString.replaceAll("\\[", "").replaceAll("\\]", "");

        System.out.println("arr_toString = " + arr_toString);
        System.out.println("arr_toString = " + arr_toString.length());
        System.out.println("repl = " + repl);
    }
}
