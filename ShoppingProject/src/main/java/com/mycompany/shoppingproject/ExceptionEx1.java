package com.mycompany.shoppingproject;


public class ExceptionEx1 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 6, 1};
        badUse(nums);
    }

    public static void badUse(int[] vals) {
        int total = 0;

        for (int i = 0; i < vals.length; i++) {
            int index = vals[i];
            try {
                total += vals[index];
            } catch (ArrayIndexOutOfBoundsException e) {
                total += vals[0];
            }
        }
        System.out.println(total);
    }
}
