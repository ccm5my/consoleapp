package com.example.problems;

import java.util.*;

public class ReformatPhoneNumber {
    public static String reformatNumber(String number) {
        number = removeSpacesAndDashes(number);
        if(number.length() < 4) {
            return number;
        }

        int start = 0;
        int end = 0;
        StringBuilder sb = new StringBuilder();

        for(int i =0; i < number.length(); i++) {
            end++;
            if(number.substring(start,end).length()==3) {
                sb.append(number.substring(start,end) + '-');
                start = end;
            }
        }

        return sb.toString();
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

