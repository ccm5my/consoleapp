package com.example.problems.toptal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        for(int num: nums) {
            list.add(num);
        }
        for(int i=0; i < nums.length; i++) {
            if(list.get(i) < 0) {
                list.remove(i);
            }
        }

        int result = 1;
        for(int i =0; i < list.size(); i++) {
            if(nums[i]==result) {
                result++;
            }
        }

        return result;
    }
}
