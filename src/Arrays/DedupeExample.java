package Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DedupeExample {

    public static void main(String[] args) {
        int[] nums = {3, 5, 3, 2, 5, 7, 2};

        // S.E.T = "Seen Elements Tracker"
        Set<Integer> seen = new HashSet<>();
        int write = 0;  // where to put the next unique value

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];

            // I = Inspect, write = Place
            if (!seen.contains(value)) {
                seen.add(value);      // track that we've seen it
                nums[write] = value;  // overwrite at write pointer
                write++;              // move write pointer
            }
        }

        // Optional: clear out the remaining unused spots
        for (int i = write; i < nums.length; i++) {
            nums[i] = 0; // or some sentinel
        }

        System.out.println("Unique count = " + write);
        System.out.println(Arrays.toString(nums));
        // e.g. [3, 5, 2, 7, 0, 0, 0]
    }
}
