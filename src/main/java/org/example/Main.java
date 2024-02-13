package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}