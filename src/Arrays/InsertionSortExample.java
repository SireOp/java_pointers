package Arrays;
import java.util.Arrays;

public class InsertionSortExample {
public static void main(String[] args){

   
  /*
    Define the array
    Handle the array as if it had two zones
    Left side: Sorted
    Right side: UnSorted
   */
    int[] nums = {89, 72, 60, 45, 42, 33};

    /*
    Use the "key" to grab the first item form the insorted zone
    Walk left through the sorted zone
    Shift  any bigger values to the right
    Drop key into the right spot
     */    
 /*
 Here we start at 1 instead of zero 
  */

    for (int i = 1; i < nums.length; i++) {

            int key = nums[i];           // value to insert
            int j = i - 1;               // compare leftwards

            // Shift larger elements to the right
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];   // <--- FIXED LINE
                j--;
            }

            // Place key in the correct spot
            nums[j + 1] = key;
        }

        System.out.println(Arrays.toString(nums));
    }
}