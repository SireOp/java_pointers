package Arrays;

import java.util.Arrays;

public class ShiftLeftExample {

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int removeIndex = 2;  // remove value 30

        // “SLIDE LEFT = Shift Later elements Down”
        for (int i = removeIndex; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1]; // shift everything left
        }

        // Optional: mark last as "empty" (depends on problem)
        nums[nums.length - 1] = 0;

        System.out.println(Arrays.toString(nums));
        // [10, 20, 40, 50, 0]
    }
}
