package com.example.problems;

import java.util.*;

public class ReformatPhoneNumber {
    public static String reformatNumber(String number) {
        number = removeSpacesAndDashes(number);
        StringBuilder sb = new StringBuilder();

        if (number.length() < 4) {
            return number;
        }

        sb.append(number.substring(0, 3) + '-');
        int start = 3;
        int length = number.substring(start).length();

        while (length > 4) {
            sb.append(number.substring(start, start+3) + '-');
            start = start+3;
            length = number.substring(start).length();
        }

        if (length == 2) {
            sb.append(number.substring(start));
        }

        if (length == 3) {
            sb.append(number.substring(start));
        }

        if (length == 4) {
            sb.append(number.substring(start, start + 2) + '-' + number.substring(start + 2));
        }

        if (sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }

    private static String removeSpacesAndDashes(String number) {
        StringBuilder sb = new StringBuilder(number);
        int matches = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '-' || number.charAt(i) == (' ')) {
                sb.deleteCharAt(i - matches);
                matches++;
            }
        }
        return sb.toString();
    }
}

