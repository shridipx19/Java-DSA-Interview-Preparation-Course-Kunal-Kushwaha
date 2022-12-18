import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindAllMissingNumbers {

     List<Integer> findAllMissingNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }

        }

        // create a new list as return type is list type
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length -1; j++) {
            if (nums[j] != j+1) {    // element not equal to index +1;
                list.add(j+1);   // where j is the index
            }

        }
        return list;
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }
}