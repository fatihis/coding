package com.company;

import javax.lang.model.util.Elements;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicate {
    public String duplicate(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        int len = numbers.length;
        Arrays.sort(numbers);

        for (int i = 0; i < len-1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                arr.add(numbers[i]);
                while (i<len-1 && numbers[i] == numbers[i + 1]) {
                    i++;
                }

            }


        }
        return arr.toString();

    }
}


/*
    Repeated Elements in an Array New
    
        Arrays   



        See Answer & Skip     I Know This
        Write a method duplicate to find the repeated or duplicate elements in an array.
        This method should return a list of repeated integers in a string with the elements sorted in ascending order (as illustrated below).


        duplicate({1,3,4,2,1}) --> "[1]"

        duplicate({1,3,4,2,1,2,4}) --> "[1, 2, 4]"



        Note: You may use toString() method to return the
        standard string representation of most data structures, and
        Arrays.sort() to sort your result. */