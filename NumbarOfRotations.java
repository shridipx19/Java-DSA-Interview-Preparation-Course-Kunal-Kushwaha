public class NumbarOfRotations {

    public static void main(String[] args) {
        int[] arr = { 6,7,78,85,96,0,2,3,4,5};
        System.out.println(numberOfRotations(arr));
    }

    static int numberOfRotations (int[] nums) {
        int pivot = findPivot( nums);  // calling findPivot function
        return pivot + 1;
    }
    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length -1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid < end && nums[mid] > nums[mid +1])
                    return mid;
                if (start < mid && nums[mid] < nums[mid -1])
                    return mid -1;
                if (nums[start] <= nums[mid])   // if the start element is smaller than the mid then we can discard the right portion from mid
                    start = mid +1;
                else    // else we will discard the left portion from mid
                    end = mid -1;

        }
        return -1;

    }

}
