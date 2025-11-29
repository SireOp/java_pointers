package Arrays;


import java.util.Arrays;

public class ShiftRightExample {

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 0}; // last slot is free
        int insertIndex = 2;  // where we want to insert
        int newValue = 99;

        // “Backwards loop when shifting right,
        //  or your data will lose the fight.”
        for (int i = nums.length - 1; i > insertIndex; i--) {
            nums[i] = nums[i - 1]; // shift values to the right
        }

        nums[insertIndex] = newValue;

        System.out.println(Arrays.toString(nums));
        // [10, 20, 99, 30, 40]
    }
}
