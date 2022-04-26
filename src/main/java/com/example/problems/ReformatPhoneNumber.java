package com.example.problems;

import java.util.*;

public class ReformatPhoneNumber {
    public static String reformatNumber(String number) {
        number = removeSpacesAndDashes(number);


        return number;
    }

    private static String removeSpacesAndDashes(String number) {
        StringBuilder sb = new StringBuilder(number);
        int matches = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '-' || number.charAt(i) == (' ')) {
                sb.deleteCharAt(i-matches);
                matches++;
            }
        }
        return sb.toString();
    }
}

