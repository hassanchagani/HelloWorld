package com.company;

/**
 * Created by hassanchagani on 3/26/17.
 */
public class Arrays {

    public static void main(String[] args) {

        // value types vs reference types
        // this is a value type
        int value = 7;

        // does not actually hold any values - this is a reference variable
        int[] values;
        values = new int[3];

        System.out.println(values[0]);

    }
}
